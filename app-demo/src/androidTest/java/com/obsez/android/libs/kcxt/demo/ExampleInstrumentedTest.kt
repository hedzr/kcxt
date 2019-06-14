package com.obsez.android.libs.kcxt.demo

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.obsez.android.libs.kcxt.demo.test", appContext.packageName)
    }
}

/*
export ANDROID_API_LEVEL=29
export ANDROID_EMULATOR_LEVEL=29
export ANDROID_BUILD_TOOLS_VERSION=29.0.1
export ANDROID_ABI=x86
export ANDROID_TAG=google_apis_playstore
export ADB_INSTALL_TIMEOUT=50
*/
