package com.example.piyush.mynav;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;



public class AnotherActivity extends AppCompatActivity{


    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent i=getIntent();
        int index= i.getIntExtra("index",0);

        fm=getSupportFragmentManager();
        FragmentB fb=(FragmentB) fm.findFragmentById(R.id.fragment2);

        fb.changeData(index);
    }
}
