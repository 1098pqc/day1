package com.example.mvptwo.model;

import com.example.mvptwo.contract.HomeContract;
import com.example.mvptwo.model.data.NewsBean;
import com.example.mvptwo.utils.INetCallBack;
import com.example.mvptwo.utils.RetrofitUtils;

public class HomeModel implements HomeContract.IHomeModel {
    
    private HomeContract.IHomePresenter presenter;

    public HomeModel(HomeContract.IHomePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        RetrofitUtils.getInstance().get(url, new INetCallBack<NewsBean>() {
            @Override
            public void onSuccess(NewsBean newsBean) {
                callBack.onSuccess((T) newsBean);
            }

            @Override
            public void onFail(String err) {
                callBack.onFail(err);
            }
        });
    }
}
