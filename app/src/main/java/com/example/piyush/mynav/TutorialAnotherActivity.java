package com.example.piyush.mynav;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TutorialAnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_another);

        Intent i=getIntent();
        int index= i.getIntExtra("TutorialIndex",0);

        FragmentManager fm=getSupportFragmentManager();

        TutorialFragmentB fb=(TutorialFragmentB) fm.findFragmentById(R.id.Tutorialfragment2);

        fb.changeData(index);

    }
}
