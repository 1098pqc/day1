package com.example.mvptwo.base;

public class BasePresenter<V extends BaseView> {
    public V iView;
    public void attachView(V v){
        this.iView = v;
    }
}
