package com.example.piyush.mynav;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




public class ActivityD extends AppCompatActivity implements FragmentD.Communicator1 {


    FragmentD fd;
    FragmentB fb;
    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        fm=getSupportFragmentManager();

        fd=(FragmentD) fm.findFragmentById(R.id.fragment1);
        fd.setCommunicator1(this);

    }

    public void respond(int index) {

        fb=(FragmentB) fm.findFragmentById(R.id.fragment2);

        if(fb!=null && fb.isVisible()){

            fb.changeData(index);
        }
        else{

            Intent i=new Intent(this,ActivityB.class);
            i.putExtra("index",index);
            startActivity(i);

        }

    }
}
