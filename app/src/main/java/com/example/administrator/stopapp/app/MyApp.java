package com.example.administrator.stopapp.app;

import android.app.Application;
import android.content.Context;

import com.example.administrator.stopapp.dagger.AppComponent;
import com.example.administrator.stopapp.dagger.AppModule;


/**
 * Created by Administrator on 2016/12/5.
 */
public class MyApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setDraggerConfig();
    }

    private void setDraggerConfig() {
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        appComponent.inject(this);
    }

    public AppComponent component(){
        return appComponent;
    }

    public static MyApp getApp(Context context){
        return ((MyApp) context.getApplicationContext());
    }




}
