package com.andcuzzi.bjn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *
 * 음식을 선택하는 화면입니다
 * seek bar 를 이용해서 음식을 선택하거나
 * 태그를 선택해서 음식을 선택할 수 있습니다
 *
 * */
public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }
}
