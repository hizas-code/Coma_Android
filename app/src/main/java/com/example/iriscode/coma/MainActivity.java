package com.example.iriscode.coma;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        fragmentTransaction.add(fragmentHome, "Home");
    }
}
