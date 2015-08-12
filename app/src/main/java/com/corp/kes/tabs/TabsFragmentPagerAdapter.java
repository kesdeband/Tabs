package com.corp.kes.tabs;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kes on 8/10/2015.
 */
public class TabsFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    //private Context context;

    public TabsFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
       // this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        /*Fragment fragment = null;
        switch(position) {
            case 1: fragment = new FragmentA();
                break;
            case 2: fragment = new FragmentB();
                break;
            case 3: fragment = new FragmentC();
        }
        return fragment;*/
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
