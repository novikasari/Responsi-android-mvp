package com.responsi.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.responsi.mvp.view.MainView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setPeopleData(List<ResultData> resultData) {
        Log.i("xxxx", "set Data " + resultData);
    }
}