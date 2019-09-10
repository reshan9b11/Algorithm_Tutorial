package com.example.piyush.mynav;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityTutorial extends AppCompatActivity implements TutorialFragmentA.Communicatortutorial{


    TutorialFragmentA fa;
    TutorialFragmentB fb;
    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        fm=getSupportFragmentManager();

        fa=(TutorialFragmentA) fm.findFragmentById(R.id.fragment1);
        fa.setCommunicatorturorial(this);


    }


    public void respond(int index) {

        fb=(TutorialFragmentB) fm.findFragmentById(R.id.fragment2);

        if(fb!=null && fb.isVisible()){

            fb.changeData(index);
        }
        else{

            Intent i=new Intent(this,TutorialAnotherActivity.class);
            i.putExtra("TutorialIndex",index);
            startActivity(i);

        }

    }

}
