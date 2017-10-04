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

    static HomeFragment fragmentHome = new HomeFragment();
    static ProfileFragment fragmentProfile = new ProfileFragment();
    static SettingFragment fragmentSetting = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(fragmentHome, "Home");
        fragmentTransaction.add(fragmentProfile, "Profile");
        fragmentTransaction.add(fragmentSetting, "Setting");
        fragmentTransaction.commit();

        setFragment("Home");
        BottomNavigationView bottomNavigation = (BottomNavigationView) findViewById(R.id.bottom_bar);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home_item : setFragment("Home"); break;
                    case R.id.profile_item : setFragment("Profile"); break;
                    case R.id.setting_item : setFragment("Setting"); break;
                }
                return false;
            }
        });
    }

    protected void setFragment(String fragmentName){
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        switch(fragmentName){
            case "Home" :
                fragmentTransaction.replace(R.id.fragment_container, fragmentHome); break;
            case "Profile" :
                fragmentTransaction.replace(R.id.fragment_container, fragmentProfile); break;
            case "Setting" :
                fragmentTransaction.replace(R.id.fragment_container, fragmentSetting); break;
        }
        fragmentTransaction.commit();
    }

}
