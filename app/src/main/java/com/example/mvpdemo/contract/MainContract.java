package com.example.mvpdemo.contract;

import com.example.mvpdemo.mvp.IBaseView;

/**
 * created by hjt
 * created on 2019/6/26
 */
public interface MainContract {

    interface View extends IBaseView {

    }

    interface Presenter {

        void getMsg();

        void getDelayMsg();
    }
}
