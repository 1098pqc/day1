package com.example.day1.contract;

import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BaseView;
import com.example.mvplibrary.utils.INetCallBack;

/**
 *  契约类
 */
public class MainContract {
    public interface IMainModel extends BaseModel {
        <T> void getLoginData(String url, INetCallBack<T> callBack);
    }
    public interface IMainPresenter{
        void login(String url);
    }
    public interface IMainView extends BaseView {
        <T> void loginRelt(T t);
    }
}
