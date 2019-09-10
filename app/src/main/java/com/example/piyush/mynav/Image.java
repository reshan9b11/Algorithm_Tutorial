package com.example.piyush.mynav;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Image extends Fragment {


    public Image() {
        // Required empty public constructor
    }


    ImageView ivv1,ivv2,ivv3,ivv4,ivv5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_image, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ivv1=(ImageView) getActivity().findViewById(R.id.one);
        ivv2=(ImageView) getActivity().findViewById(R.id.two);
        ivv3=(ImageView) getActivity().findViewById(R.id.three);
        ivv4=(ImageView) getActivity().findViewById(R.id.four);
        ivv5=(ImageView) getActivity().findViewById(R.id.five);


        ivv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ivv1.setVisibility(View.GONE);
                ivv2.setVisibility(View.VISIBLE);
                ivv3.setVisibility(View.GONE);
                ivv4.setVisibility(View.GONE);
                ivv5.setVisibility(View.GONE);
            }
        });

        ivv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivv1.setVisibility(View.GONE);
                ivv2.setVisibility(View.GONE);
                ivv3.setVisibility(View.VISIBLE);
                ivv4.setVisibility(View.GONE);
                ivv5.setVisibility(View.GONE);
            }
        });


        ivv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivv1.setVisibility(View.GONE);
                ivv2.setVisibility(View.GONE);
                ivv3.setVisibility(View.GONE);
                ivv4.setVisibility(View.VISIBLE);
                ivv5.setVisibility(View.GONE);
            }
        });


        ivv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivv1.setVisibility(View.GONE);
                ivv2.setVisibility(View.GONE);
                ivv3.setVisibility(View.GONE);
                ivv4.setVisibility(View.GONE);
                ivv5.setVisibility(View.VISIBLE);
            }
        });


        ivv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivv1.setVisibility(View.VISIBLE);
                ivv2.setVisibility(View.GONE);
                ivv3.setVisibility(View.GONE);
                ivv4.setVisibility(View.GONE);
                ivv5.setVisibility(View.GONE);
            }
        });



    }
}
