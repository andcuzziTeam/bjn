package com.andcuzzi.bjn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *
 * 메인페이지에는 새로 만든 Activity 로 이동할 수 있는 버튼 들을 추가 합니다
 * 새로운 페이지를 만들 때마다 버튼이 추가 됩니다
 *
 * 프로젝트 시작시 동기화를 한 후 일을 시작합니다
 *
 *
 * 자신이 만든 것 설명 하는 방법
 *
 * 1. 주요 기능(사용자 관점) : ex) 데이터를 받아 결과를 여러 페이지에 걸쳐 보여준다
 *
 * 2. 주요 서비스 : ex) 결과 데이터 (Response) --> 결과에 따라 화면 표시
 *
 * 3. 사용된 객체 :
 * ex)
 * 3-1. myViewPager extends viewpager (android.support.v4.view)
 * 3-2. myFragment extends Fragment (android.support.v4)
 * 3-3. ServiceCenter (com.andcuzzi.service)
 *
 * 기본 개발 단위를 Microservice -> Nanoservice -> 하나의 객체 -> 함수
 *
 *
 *  by Taehoon Kang
 * */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void selectClicked(View view){
        //Go to SelectActivity
        Intent intent = new Intent(getApplicationContext(),SelectActivity.class);
        startActivity(intent);

    }

    protected void resultClicked(View view){
        //Go to ResultActivity
        Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
        startActivity(intent);

    }

}
