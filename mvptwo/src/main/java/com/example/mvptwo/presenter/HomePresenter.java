package com.example.mvptwo.presenter;

import com.example.mvptwo.base.BasePresenter;
import com.example.mvptwo.contract.HomeContract;
import com.example.mvptwo.model.HomeModel;
import com.example.mvptwo.model.data.NewsBean;
import com.example.mvptwo.utils.INetCallBack;

public class HomePresenter extends BasePresenter<HomeContract.IHomeView> implements HomeContract.IHomePresenter {

    private HomeContract.IHomeModel model;

    public HomePresenter(HomeContract.IHomeView mainActivity) {
        this.model = new HomeModel(this);
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
                iView.tiop(err);
            }
        });
    }
}
