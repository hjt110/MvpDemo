package com.example.mvpdemo.mvp;

import android.content.Context;

/**
 * created by hjt
 * created on 2019/6/26
 */
public interface IBaseView {

    void show(String msg);

    Context getContext();
}
