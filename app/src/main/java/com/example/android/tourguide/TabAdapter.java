package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class TabAdapter extends FragmentPagerAdapter {

    private Context context;


    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new ShoppingFragment();
        }
    }



    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.hotel);
        } else if (position == 1) {
            return context.getString(R.string.muse);
        } else if (position == 2) {
            return context.getString(R.string.res);
        } else {
            return context.getString(R.string.shop);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


}