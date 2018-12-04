package com.example.yarik.human2;

import android.app.Application;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class AppAplication extends Application {
    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
