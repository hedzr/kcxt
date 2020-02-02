package com.obsez.android.libs.kcxt

import android.annotation.SuppressLint
import android.os.Build
import androidx.core.os.BuildCompat

@Suppress("unused")
@SuppressLint("ObsoleteSdkInt")
object BuildUtil {
    
    fun isAtLeastNExt(): Boolean {
        return BuildCompat.isAtLeastN() // Just a flag to trace BuildCompat
    }
    
    /**
     * for Android Q / 10.0 / SDK 29.
     * BuildCompat.isAtLeastQ() has wrong return in OnePlus Android Q / 10.0 / SDK 29.
     */
    fun isAtLeastQ(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
    }
    
    /**
     * for Android Q / 10.0 / SDK 29.
     * BuildCompat.isAtLeast29() has wrong return in OnePlus Android Q / 10.0 / SDK 29.
     */
    fun isAtLeast29(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
    }
    
    /**
     * for Android Q / 10.0 / SDK 29.
     * BuildCompat.isAtLeastAndroid10() has wrong return in OnePlus Android Q / 10.0 / SDK 29.
     */
    fun isAtLeastAndroid10(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
    }
    
    
    /**
     * for Android P / 9.0 / SDK 28.
     */
    fun isAtLeastP(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.P
    }
    
    /**
     * for Android O MR1 / 8.1 / SDK 27.
     */
    fun isAtLeastOMR1(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1
    }
    
    /**
     * for Android O / 8.0 / SDK 26.
     */
    fun isAtLeastO(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
    }
    
    /**
     * for Android N MR1 / 7.1 / SDK 25.
     */
    fun isAtLeastNMR1(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1
    }
    
    
    /**
     * for Android N / 7.0 / SDK 24.
     */
    fun isAtLeastN(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
    }
    
    /**
     * for Android N / 7.0 / SDK 24.
     */
    fun isAtLeast24(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
    }
    
    /**
     * for Android N / 7.0 / SDK 24.
     */
    fun isAtLeastAndroid7_0(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
    }
    
    
    /**
     * for Android Lollipop / 5.0 / SDK 21.
     */
    fun isAtLeast21(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
    }
    
    /**
     * for Android Lollipop / 5.0 / SDK 21.
     */
    fun isAtLeastLollipop(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
    }
    
    /**
     * for Android Lollipop / 5.0 / SDK 21.
     */
    fun isAtLeastAndroid5_0(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP
    }
    
    
    /**
     * for Android Kitkat / 4.4 / SDK 19.
     */
    fun isAtLeast19(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
    }
    
    /**
     * for Android Kitkat / 4.4 / SDK 19.
     */
    fun isAtLeastKitkat(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
    }
    
    /**
     * for Android Kitkat / 4.4 / SDK 19.
     */
    fun isAtLeastAndroid4_4(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
    }
    
    
    /**
     * for Android JellyBean / 4.1 / SDK 16.
     */
    fun isAtLeast16(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN
    }
    
    /**
     * for Android JellyBean / 4.1 / SDK 16.
     */
    fun isAtLeastJellybean(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN
    }
    
    /**
     * for Android JellyBean / 4.1 / SDK 16.
     */
    fun isAtLeastAndroid4_1(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN
    }
}
