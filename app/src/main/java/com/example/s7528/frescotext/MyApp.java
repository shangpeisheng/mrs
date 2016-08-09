package com.example.s7528.frescotext;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by s7528 on 2016/08/05.
 */
public class MyApp extends Application{
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
