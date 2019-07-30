package com.example.mvpdemo.utils;

import java.lang.reflect.ParameterizedType;

/**
 * created by hjt
 * created on 2019/6/26
 */
public class TUtils {
    public static <T> T getT(Object o, int i) {
        try {
            return ((Class<T>) ((ParameterizedType) (o.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[i]).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
