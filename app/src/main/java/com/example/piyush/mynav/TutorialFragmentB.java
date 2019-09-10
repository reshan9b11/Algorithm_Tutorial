package com.example.piyush.mynav;

/*

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TutorialFragmentB extends Fragment {


    public TutorialFragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmentb_tutorial, container, false);
    }

}

*/


import android.content.res.Resources;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TutorialFragmentB extends Fragment {


    public TutorialFragmentB() {
        // Required empty public constructor
    }

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragmentb_tutorial, container, false);

        tv=(TextView) view.findViewById(R.id.tv);


        if (savedInstanceState==null)
        {

        }
        else{

            index=savedInstanceState.getInt("index");
            savedata=savedInstanceState.getString("savedata");
            TextView tv =(TextView) view.findViewById(R.id.tv);

            tv.setText(savedata);
        }


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    String savedata;
    int index;
    public void changeData(int index){

        this.index=index;
        String[] description= getResources().getStringArray(R.array.TutorialDescription);

        savedata=description[index];

        tv.setText(savedata);

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putInt("TutorialIndex",index);
        outState.putString("savedata",savedata);
    }
}

