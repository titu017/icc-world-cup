package org.ajobdesh.wc.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> firstFragment = new ArrayList<>();
    private final List<String> firstTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return firstFragment.get(i);
    }

    @Override
    public int getCount() {
        return firstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return firstTitle.get(position);
    }

    public void AddFragment(Fragment fragment, String title){
        firstFragment.add(fragment);
        firstTitle.add(title);
    }
}
