package com.example.mvpdemo.model;

import android.os.Handler;

import com.example.mvpdemo.mvp.MyCallbak;

/**
 * created by hjt
 * created on 2019/6/26
 */
public class MainModel {

    public void getMsg(MyCallbak myCallbak) {
        String msg = "我就是msg了";
        myCallbak.onSuccess(msg);
    }

    public void getDelayMsg(final MyCallbak myCallbak) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String msg = "获取到延迟msg";
                myCallbak.onSuccess(msg);
            }
        }, 5000);
    }
}
