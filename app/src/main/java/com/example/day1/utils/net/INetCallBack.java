package com.example.day1.utils.net;

public interface INetCallBack<T> {

    public void onSuccess(T t);

    public void onFail(String err);
}
