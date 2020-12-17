package com.example.mvptwo.view;

import android.util.Log;

import com.example.mvptwo.R;
import com.example.mvptwo.base.BaseActivity;
import com.example.mvptwo.contract.HomeContract;
import com.example.mvptwo.model.data.NewsBean;
import com.example.mvptwo.presenter.HomePresenter;
import com.example.mvptwo.utils.URLConstant;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<HomePresenter> implements HomeContract.IHomeView {
    private ArrayList<NewsBean.NewsDTO> list = new ArrayList<>();
    @Override
    protected void initData() {
        presenter.login(URLConstant.NEWLIST);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public HomePresenter getPresenter() {
        return new HomePresenter(this);
    }

    @Override
    public <T> void loginRelt(T t) {
        NewsBean newsBean = (NewsBean) t;
        list.clear();
        list.addAll(newsBean.getNews());
        for (int i = 0; i < list.size(); i++) {
            Log.e("TAG", "loginRelt: "+list.get(i).getContent());
            Log.e("TAG", "loginRelt: "+list.get(i).getImageUrl());
            Log.e("TAG", "loginRelt: "+list.get(i).getTile());
        }
    }

    @Override
    public void tiop(String err) {
        Log.e("TAG", "tiop: "+err);
    }
}