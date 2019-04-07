package com.zemu.jpush.myapplication;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);
    }
}
