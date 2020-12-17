package com.example.day1.presenter;

import com.example.day1.base.BasePresenter;
import com.example.day1.contract.MainContract;
import com.example.day1.model.MainModelImpl;
import com.example.day1.model.data.NewsBean;
import com.example.day1.utils.net.INetCallBack;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {

    private MainContract.IMainModel model;

    public MainPresenterImpl(MainContract.IMainView view) {
        this.model = new MainModelImpl(this);
    }

    @Override
    public void login(String url) {
        model.getLoginData(url, new INetCallBack<NewsBean>() {
            @Override
            public void onSuccess(NewsBean newsBean) {
                iView.loginRelt(newsBean);
            }

            @Override
            public void onFail(String err) {
                iView.tips(err);
            }
        });
    }
}
