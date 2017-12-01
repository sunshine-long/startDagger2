package com.example.marlon.startdaggar;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;

/**
 * @author Marlon
 * @date 2017/12/1
 */

public class MyApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
