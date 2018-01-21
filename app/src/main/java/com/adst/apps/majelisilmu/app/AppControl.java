package com.adst.apps.majelisilmu.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.multidex.MultiDexApplication;

/**
 * Created by ryanzulham on 4/11/17.
 */

public class AppControl extends MultiDexApplication {
    public static AppControl instance;
    private SharedPreferences sharedPreferences;


    public static AppControl getInstance() {
        return instance;
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance = this;
        this.sharedPreferences = getSharedPreferences(AppControl.class.getSimpleName(), Context.MODE_PRIVATE);

    }
}
