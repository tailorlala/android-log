package com.android.caifeng.tools;

import com.android.caifeng.BuildConfig;

/**
 * Created by caifeng on 2017/2/16.
 */

public class Log {
    //    private static final boolean DEBUG = true;
    private static final boolean DEBUG = BuildConfig.DEBUG;
    private static String TAG = "";//fill your app packagename


    public static void i(String tag, String msg) {
        if (DEBUG)
            android.util.Log.i(tag, msg);
    }

    public static void i( String msg) {
        if (DEBUG)
            android.util.Log.i(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (DEBUG)
            android.util.Log.e(tag, msg);
    }

    public static void e( String msg) {
        if (DEBUG)
            android.util.Log.e(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (DEBUG)
            android.util.Log.d(tag, msg);
    }

    public static void d( String msg) {
        if (DEBUG)
            android.util.Log.d(TAG, msg);
    }

    public static void v(String tag, String msg) {
        if (DEBUG)
            android.util.Log.v(tag, msg);
    }

    public static void v( String msg) {
        if (DEBUG)
            android.util.Log.v(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (DEBUG)
            android.util.Log.w(tag, msg);
    }

    public static void w( String msg) {
        if (DEBUG)
            android.util.Log.w(TAG, msg);
    }
}
