package com.blackwater.blackpapers.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.blackwater.blackpapers.Fragment.CategoryFragment;
import com.blackwater.blackpapers.Fragment.LiveFagment;
import com.blackwater.blackpapers.Fragment.TrendingFragment;

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public MyFragmentAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return LiveFagment.getInstance();
        else if(position == 1 )
            return CategoryFragment.getInstance();
        else if(position == 2 )
            return TrendingFragment.getInstance();
            return null;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Live";
            case 1:
                return "Categories";
            case 2:
                return "Trending";
        }
        return "";
    }
}
