package com.andcuzzi.bjn;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andcuzzi.bjn.SeekBar_Fragment_View.ViewPagerFragment;

/**
 *
 * 음식을 선택하는 화면입니다
 * seek bar 를 이용해서 음식을 선택하거나
 * 태그를 선택해서 음식을 선택할 수 있습니다
 *
 * */
public class SelectActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String VEIWPAGER_FRAGMENT = "viewpager_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ViewPagerFragment savedFragment = (ViewPagerFragment) getSupportFragmentManager()
                .findFragmentByTag(VEIWPAGER_FRAGMENT);

        if (savedFragment == null) {

            ViewPagerFragment viewPagerFragment = new ViewPagerFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeHolder, viewPagerFragment, VEIWPAGER_FRAGMENT);
            fragmentTransaction.commit();
        }//if there is no saved view pager fragment then make a new one.
    }
}
