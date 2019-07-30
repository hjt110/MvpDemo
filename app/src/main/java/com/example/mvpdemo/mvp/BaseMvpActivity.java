package com.example.mvpdemo.mvp;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mvpdemo.utils.TUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * created by hjt
 * created on 2019/6/26
 */
public abstract class BaseMvpActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {

    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = TUtils.getT(this, 0);
        mPresenter.attachView(this);
    }

    protected P getP() {
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void show(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
