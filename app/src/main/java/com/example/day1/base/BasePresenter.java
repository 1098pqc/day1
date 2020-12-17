package com.example.day1.base;

public class BasePresenter<V extends BaseView> {
    public V iView;
    public void attachView(V v){
        this.iView = v;
    }
}
