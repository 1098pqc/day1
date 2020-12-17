package com.example.day1.contract;

import com.example.day1.utils.net.IBaseView;
import com.example.day1.utils.net.INetCallBack;

/**
 *  契约类
 */
public class MainContract {
    public interface IMainModel{
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }
    public interface IMainPresenter{
        void login(String url);
    }
    public interface IMainView extends IBaseView {
        <T> void loginRelt(T t);
    }
}
