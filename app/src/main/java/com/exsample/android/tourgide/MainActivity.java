package com.exsample.android.tourgide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.view_pager);

        //Find the TabLayout
        TabLayout tab = findViewById(R.id.tabs);
        //Set the toolbar to act as the ActionBar
        tab.setupWithViewPager(viewPager);

        // Set the adapter onto the view pager
        viewPager.setAdapter(new PlaceFragmentPagerAdapter(getSupportFragmentManager(),MainActivity.this));

    }

}
