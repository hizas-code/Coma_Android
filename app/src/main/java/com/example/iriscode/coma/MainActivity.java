package com.example.iriscode.coma;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment fragmentHome = new HomeFragment();
        ProfileFragment fragmentProfile = new ProfileFragment();
        SettingFragment fragmentSetting = new SettingFragment();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(fragmentHome, "Home");
        fragmentTransaction.add(fragmentProfile, "Profile");
        fragmentTransaction.add(fragmentSetting, "Setting");
        fragmentTransaction.commit();

        //setFragment("Home");
        BottomNavigationView bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_bar);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Overridew
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return false;
            }
        });
    }
/*
    protected void setFragment(String fragmentName){
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        switch(fragmentName){
            case "Home" :
                fragmentTransaction.replace(R.id.fragment_container, fragmentHome);
            case "Profile" :
                fragmentTransaction.replace(R.id.fragment_container, fragmentProfile);
            case "Setting" :
                fragmentTransaction.replace(R.id.fragment_container, fragmentSetting);
        }
    }*/

}
