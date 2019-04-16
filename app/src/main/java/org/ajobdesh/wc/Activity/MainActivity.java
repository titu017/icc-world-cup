package org.ajobdesh.wc.Activity;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ajobdesh.wc.Adapter.ViewPagerAdapter;
import org.ajobdesh.wc.Fragments.FragmentFixture;
import org.ajobdesh.wc.Fragments.FragmentIccRanking;
import org.ajobdesh.wc.Fragments.FragmentSquad;
import org.ajobdesh.wc.R;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_Id);
        viewPager = (ViewPager) findViewById(R.id.viewPager_Id);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add Fragment Here

        adapter.AddFragment(new FragmentFixture(), "Fixture");
        adapter.AddFragment(new FragmentIccRanking(),"Ranking");
        adapter.AddFragment(new FragmentSquad(),"Squads");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setElevation(0);

    }

}
