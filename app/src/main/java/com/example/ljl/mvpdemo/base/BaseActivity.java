package com.example.ljl.mvpdemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Ljl on 2017/12/10.
 */

public abstract class BaseActivity<V, P extends BasePresenter<V>> extends Activity {
    //表示层的引用
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = creatPresenter();
        mPresenter.attachView((V) this);
    }

    protected abstract P creatPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
