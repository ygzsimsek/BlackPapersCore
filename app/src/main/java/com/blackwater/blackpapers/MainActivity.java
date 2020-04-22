package com.blackwater.blackpapers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.blackwater.blackpapers.Fragment.AppFragment;
import com.blackwater.blackpapers.Fragment.CategoryFragment;
import com.blackwater.blackpapers.Fragment.LiveFagment;
import com.blackwater.blackpapers.Fragment.TrendingFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.layout_frame_main);
        BottomNavigationView navigation = (BottomNavigationView)findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //set fragment at start
        CategoryFragment categoryFragment = new CategoryFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.layout_frame_main, categoryFragment);
        transaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    CategoryFragment categoryFragment = new  CategoryFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.layout_frame_main, categoryFragment);
                    transaction.commit();
                    return true;
                case R.id.nav_selections:
                    TrendingFragment trendingFragment = new TrendingFragment();
                    FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                    transaction1.replace(R.id.layout_frame_main, trendingFragment);
                    transaction1.commit();
                    return true;
                case R.id.nav_app:
                    AppFragment appFragment = new AppFragment();
                    FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                    transaction2.replace(R.id.layout_frame_main, appFragment);
                    transaction2.commit();
                    return true;
            }
            return false;
        }
    };


}
