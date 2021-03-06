package com.example.piyush.mynav;

/*
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }
}


*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class ActivityC extends FragmentActivity {


    ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        viewPager=(ViewPager)findViewById(R.id.pager);
        FragmentManager fm=getSupportFragmentManager();

        viewPager.setAdapter(new myAdapter(fm));

    }



    class myAdapter extends FragmentStatePagerAdapter
    {


        public myAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment=null;

            if(position==0)
            {
                fragment=new FragmentC1();
            }

            if(position==1)
            {
                fragment=new FragmentC2();
            }

            if(position==2)
            {
                fragment=new FragmentC3();
            }

            if(position==3)
            {
                fragment=new FragmentC4();
            }

            if(position==4)
            {
                fragment=new FragmentC5();
            }

            if(position==5)
            {
                fragment=new FragmentC6();
            }

            if(position==6)
            {
                fragment=new FragmentC7();
            }



            return fragment;
        }

        @Override
        public int getCount() {
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {


            if(position==0){
                return "PAGE->1";
            }

            if(position==1){
                return "PAGE->2";
            }

            if(position==2){
                return "PAGE->3";
            }

            if(position==3){
                return "PAGE->4";
            }

            if(position==4){
                return "PAGE->5";
            }

            if(position==5){
                return "PAGE->6";
            }
            if(position==6){
                return "PAGE->7";
            }




            return null;
        }
    }


}
