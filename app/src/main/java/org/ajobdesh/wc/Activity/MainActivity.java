package org.ajobdesh.wc.Activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBarId);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        toolbar.setPadding(0,22,0,0);


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.aboutUsItemId:


            case R.id.contactUsItemId:

        }
        return super.onOptionsItemSelected(item);
    }
}
