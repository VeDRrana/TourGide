package com.exsample.android.tourgide;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter{

    private Context mContext;

    //Set tabTitle list with all screen titles
    private String tabTitle[] = new String[]{"Varaždin","Varaždinske Toplice","Ludbreg","Trakoščan"};

    public PlaceFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VarazdinFragment();
        } else if (position == 1){
            return new TopliceFragment();
        } else if (position == 2){
            return new LudbregFragment();
        }else {
            return new TrakoscanFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) { return tabTitle[position]; }
}
