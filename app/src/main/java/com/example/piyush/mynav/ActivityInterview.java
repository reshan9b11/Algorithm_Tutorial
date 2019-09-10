package com.example.piyush.mynav;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityInterview extends AppCompatActivity implements FragmentA.Communicator{



    FragmentA fa;
    FragmentB fb;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        fm=getSupportFragmentManager();

        fa=(FragmentA) fm.findFragmentById(R.id.fragment1);
        fa.setCommunicator(this);

    }




    @Override
    public void respond(int index) {

        fb=(FragmentB) fm.findFragmentById(R.id.fragment2);

            fb.changeData(index);



    }
}
