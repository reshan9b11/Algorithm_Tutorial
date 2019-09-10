package com.example.piyush.mynav;



import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {


    public FragmentB() {
        // Required empty public constructor
    }

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_b, container, false);

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
        String[] description= getResources().getStringArray(R.array.Description);

        savedata=description[index];

        tv.setText(savedata);

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putInt("index",index);
        outState.putString("savedata",savedata);
    }
}
