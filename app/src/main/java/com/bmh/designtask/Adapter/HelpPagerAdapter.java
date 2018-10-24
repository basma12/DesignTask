package com.bmh.designtask.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bmh.designtask.Fragment.AcceptedFragment;
import com.bmh.designtask.Fragment.CanceledFragment;
import com.bmh.designtask.Fragment.WaitedFragment;

public class HelpPagerAdapter extends FragmentPagerAdapter {
    String[] titles=new String[]{"تم الإلغاء","تم القبول","قيد الإنتظار"};
    private static int NUM_ITEMS = 3;

    public HelpPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CanceledFragment();
            case 1:
                return new AcceptedFragment();
            case 2:
                return new WaitedFragment();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }


}

