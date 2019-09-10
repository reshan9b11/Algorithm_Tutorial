package com.example.piyush.mynav;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityAboutUs extends AppCompatActivity {


    FragmentManager fm;
    FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        fm=getSupportFragmentManager();


        ft = fm.beginTransaction();
        ft.add(R.id.AboutContainer, new FragmentAbout(), "fragAbout");
//        ft.addToBackStack("fbasd");
        ft.commit();


    }
}
