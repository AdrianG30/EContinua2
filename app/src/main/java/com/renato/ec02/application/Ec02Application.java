package com.renato.ec02.application;
import android.app.Application;
import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

public class Ec02Application extends Application{
    private static Ec02Application instance;
    private static Context appContext;

    public static Ec02Application getInstance(){ return instance;}
    public static Context getAppContext(){return appContext;}
    public  void  setAppContext(Context mAppContext){this.appContext=mAppContext;}
    @Override
    public void onCreate(){
        super.onCreate();
        instance=this;
        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
