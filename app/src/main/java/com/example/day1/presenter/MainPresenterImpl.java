package com.example.day1.presenter;

import com.example.day1.contract.MainContract;
import com.example.day1.model.MainModelImpl;
import com.example.day1.model.data.NewsBean;
import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.utils.INetCallBack;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView,MainContract.IMainModel> implements MainContract.IMainPresenter {


    @Override
    public void login(String url) {
        iModel = new MainModelImpl(this);
        iModel.getLoginData(url, new INetCallBack<NewsBean>() {
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

    @Override
    public MainContract.IMainModel getiModel() {
        return new MainModelImpl(this);
    }
}
