package com.example.piyush.mynav;

/*
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



public class FragmentD extends Fragment {


    public FragmentD() {
        // Required empty public constructor
    }

    ListView lv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d, container, false);
    }

}

*/



import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentD extends Fragment implements AdapterView.OnItemClickListener {


    public FragmentD() {
        // Required empty public constructor
    }

    ListView lv;
    Communicator1 comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_d, container, false);

        return view;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState==null){
            position=0;
        }
        else{
            position=savedInstanceState.getInt("fragA");
        }

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        lv=(ListView) getActivity().findViewById(R.id.lv);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.chapter,android.R.layout.simple_list_item_1);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);



    }

    public void setCommunicator1(Communicator1 c){
        comm=c;
    }

    public interface Communicator1 {

        public void respond(int index);

    }

    int position;
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        this.position=position;
        comm.respond(position);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("fragA",position);

    }
}
