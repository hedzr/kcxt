package com.obsez.android.libs.kcxt

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.ContentProvider
import android.content.Context


/**
 * @return the applicationContext of your app
 */
@Suppress("unused")
val appGlobal: Application?
    get() = _application
        ?: initAndGetAppContextWithReflection()

/**
 * @return the top of activities, of your app
 */
@Suppress("unused")
val currentActivity: Activity?
    get() = ActivityProvider.currentActivity


@Suppress("ObjectPropertyName")
@SuppressLint("StaticFieldLeak")
internal var _application: Application? = null
    internal set(value) {
        field = value
        if (value != null) {
            for (it in ApplicationProvider.applicationListeners) {
                it.invoke(value)
            }
        }
    }

/**
 * This methods is only run if [appGlobal] is accessed while [AppContextProvider] hasn't been
 * initialized. This may happen in case you're accessing it outside the default process, or in case
 * you are accessing it in a [ContentProvider] with a higher priority than [AppContextProvider]
 * (900 at the time of writing this doc).
 *
 * //from https://github.com/LouisCAD/Splitties/tree/master/appctx
 */
@SuppressLint("PrivateApi")
private fun initAndGetAppContextWithReflection(): Application? {
    // Fallback, should only run once per non default process.
    val activityThread = Class.forName("android.app.ActivityThread")
    val ctx = activityThread.getDeclaredMethod("currentApplication").invoke(null) as? Context
    if (ctx is Application) {
        _application = ctx
        return ctx
    }
    return null
}
