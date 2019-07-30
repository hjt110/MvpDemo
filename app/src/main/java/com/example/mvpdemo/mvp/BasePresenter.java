package com.example.mvpdemo.mvp;

import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;

/**
 * created by hjt
 * created on 2019/6/26
 */
public abstract class BasePresenter<V extends IBaseView> {

    private WeakReference<V> mWeakReference;
    private V mProxyView;

    public void attachView(V view) {
        mWeakReference = new WeakReference<>(view);
        MvpViewHandler viewHandler = new MvpViewHandler(mWeakReference);
        mProxyView = (V) Proxy.newProxyInstance(view.getClass().getClassLoader(), view.getClass()
                .getInterfaces(), viewHandler);
    }

    public V getView() {
        return mProxyView;
    }

    public void detachView() {
        if (mWeakReference != null) {
            mWeakReference.clear();
            mWeakReference = null;
        }
    }

}
