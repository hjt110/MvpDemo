package com.example.mvpdemo.presenter;

import com.example.mvpdemo.contract.MainContract;
import com.example.mvpdemo.model.MainModel;
import com.example.mvpdemo.mvp.BasePresenter;
import com.example.mvpdemo.mvp.MyCallbak;

/**
 * created by hjt
 * created on 2019/6/26
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private final MainModel mainModel;

    public MainPresenter() {
        mainModel = new MainModel();
    }


    @Override
    public void getMsg() {
        mainModel.getMsg(new MyCallbak() {
            @Override
            public void onSuccess(Object msg) {
                getView().show((String) msg);
            }
        });
    }

    @Override
    public void getDelayMsg() {
        mainModel.getDelayMsg(new MyCallbak() {
            @Override
            public void onSuccess(Object msg) {
                getView().show((String) msg);
            }
        });
    }
}
