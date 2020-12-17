package com.example.mvptwo.contract;

import com.example.mvptwo.base.BaseView;
import com.example.mvptwo.utils.INetCallBack;

public class HomeContract {
    public interface IHomeModel{
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }
    public interface IHomePresenter{
        void login(String url);
    }
    public interface IHomeView extends BaseView{
        <T> void loginRelt(T t);
    }
}
