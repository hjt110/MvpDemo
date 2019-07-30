package com.example.mvpdemo.mvp;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * created by hjt
 * created on 2019/7/30
 */
public class MvpViewHandler implements InvocationHandler {

    private WeakReference weakReference;

    public MvpViewHandler(WeakReference weakReference) {
        this.weakReference = weakReference;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (weakReference != null && weakReference.get() != null) {
            return method.invoke(weakReference.get(), objects);
        }
        return null;
    }
}
