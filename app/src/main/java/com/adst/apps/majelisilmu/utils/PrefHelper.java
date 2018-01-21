package com.adst.apps.majelisilmu.utils;

import android.content.SharedPreferences;

import com.adst.apps.majelisilmu.app.AppControl;


/**
 * Created by ryanzulham on 4/11/17.
 */

public class PrefHelper {

    public enum PrefKey {

    }


    private static SharedPreferences preferences;

    private static void initPref() {
        preferences = AppControl.getInstance().getSharedPreferences();
    }

    public static void setString(PrefKey key, String value){
        initPref();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key.toString(), value);
        editor.commit();
    }

    public static String getString(PrefKey key){
        initPref();
        return preferences.getString(key.toString(), "");
    }

    public static void setInt(PrefKey key, int value){
        initPref();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key.toString(), value);
        editor.commit();
    }

    public static int getInt(PrefKey key){
        initPref();
        return preferences.getInt(key.toString(), -1);
    }

    public static void setBoolean(PrefKey key, boolean value){
        initPref();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key.toString(), value);
        editor.commit();
    }

    public static boolean getBoolean(PrefKey key){
        initPref();
        return preferences.getBoolean(key.toString(), false);
    }

    public static void clearPreference(PrefKey key){
        initPref();
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove(key.toString());
        editor.commit();
    }

    public static void clearAllPreferences(){
        initPref();
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }
}
