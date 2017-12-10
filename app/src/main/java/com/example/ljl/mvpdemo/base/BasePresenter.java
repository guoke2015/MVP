package com.example.ljl.mvpdemo.base;

import com.example.ljl.mvpdemo.view.IView;

import java.lang.ref.WeakReference;

/**
 * Created by Ljl on 2017/12/10.
 */

public class BasePresenter<V> {
    //view层的引用
//    private IView view;
    protected WeakReference<V> mViewRef;

    //进行绑定
    public void attachView(V view) {
        mViewRef = new WeakReference<V>(view);
    }

    //进行解绑
    public void detachView() {
        mViewRef.clear();
    }
}
