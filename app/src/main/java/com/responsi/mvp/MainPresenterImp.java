package com.responsi.mvp;

import com.responsi.mvp.presenter.MainPresenter;
import com.responsi.mvp.service.ApiService;
import com.responsi.mvp.view.MainView;

public class MainPresenterImp implements MainPresenter {

    MainView mainView;
    ApiService apiService;

    public MainPresenterImp(MainView mainView){
        this.mainView = mainView;
    }
    @Override
    public void callPeopleData(String results, String nat) {

    }
}
