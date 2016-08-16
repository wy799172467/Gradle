package com.example.wangy.gradletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.geone.library.manager.MapViewManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapViewManager mapViewManager=MapViewManager.getInstance();
    }
}
