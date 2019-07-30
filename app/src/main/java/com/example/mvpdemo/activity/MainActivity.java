package com.example.mvpdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mvpdemo.R;
import com.example.mvpdemo.contract.MainContract;
import com.example.mvpdemo.mvp.BaseMvpActivity;
import com.example.mvpdemo.presenter.MainPresenter;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_getMsg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getP().getMsg();
            }
        });

        findViewById(R.id.tv_getDelayMsg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getP().getDelayMsg();
            }
        });

        findViewById(R.id.tv_startMainActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });
    }

}
