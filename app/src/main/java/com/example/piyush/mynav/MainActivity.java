package com.example.piyush.mynav;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.piyush.mynav.FragmentA.Communicator;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    Button fl;
   // ImageView ivv1,ivv2,ivv3,ivv4,ivv5;

//    FragmentA fa;
//    FragmentB fb;
    LoginFragment lf;
   FragmentManager fm=getSupportFragmentManager();
FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "hi piyush this is your floating action button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        FragmentContentBottom fcb=new FragmentContentBottom();
         ft=fm.beginTransaction();

        ft.add(R.id.loginfragment,fcb,"FCB");

        ft.commit();

        fl = (Button) findViewById(R.id.login);

        fl.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

              //  LoginFragment newFragment = new LoginFragment();

                ft = getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack so the user can navigate back
                ft.replace(R.id.loginfragment,new LoginFragment());
                ft.addToBackStack(null);

// Commit the transaction
                ft.commit();


fl.setVisibility(View.INVISIBLE);
            }
        });


/*
        ivv1=(ImageView)findViewById(R.id.one);
        ivv2=(ImageView)findViewById(R.id.two);
        ivv3=(ImageView)findViewById(R.id.three);
        ivv4=(ImageView)findViewById(R.id.four);
        ivv5=(ImageView)findViewById(R.id.five);


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

*/


/**
        fa=(FragmentA) fm.findFragmentById(R.id.fragment1);
        fa.setCommunicator(this);

        */
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

Intent intent=null;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


            startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);

          //  Toast.makeText(this,"this is my setting",Toast.LENGTH_SHORT).show();

            return true;
        }

        if (id == R.id.action_exit) {


            finish();

            return true;
        }

        if (id == R.id.action_aboutus) {

            intent = new Intent(this, ActivityAboutUs.class);
            startActivity(intent);

            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent = null;
        String title= (String) item.getTitle();


        if (id == R.id.Tutorial) {
            intent = new Intent(this, ActivityTutorial.class);
            startActivity(intent);

            // Handle the camera action
        } else if (id == R.id.Algorithms) {

            intent = new Intent(this, ActivityD.class);
            startActivity(intent);





        } else if (id == R.id.interview) {

//            intent = new Intent(this, ActivityD.class);
  //          startActivity(intent);

            intent = new Intent(this, ActivityInterview.class);
            startActivity(intent);




        } else if (id == R.id.flowchart) {

            intent = new Intent(this, ActivityC.class);
            startActivity(intent);


            }

            else if (id== R.id.quiz){
            intent = new Intent(this, QuizActivity.class);
            startActivity(intent);

        }

            else if (id == R.id.nav_share) {


            Intent shareAppIntent = new Intent(Intent.ACTION_SEND);
            shareAppIntent.setType("text/plain");
            String shareMsg = "Room Finder will help you to find easily home/pg/flats";
            shareAppIntent.putExtra(Intent.EXTRA_SUBJECT,"Share Room Finder");
            shareAppIntent.putExtra(Intent.EXTRA_TEXT,shareMsg);
            startActivity(Intent.createChooser(shareAppIntent,"Share Via"));



        } else if (id == R.id.nav_send) {

            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_SUBJECT,"Email Subject");
            email.putExtra(Intent.EXTRA_TEXT,"body of Email");

//need this to prompts email client only
            email.setType("message/rfc822");

            startActivity(Intent.createChooser(email, "Choose an Email client :"));


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

/*
    @Override
    public void respond(int index) {


        fb=(FragmentB) fm.findFragmentById(R.id.fragment2);

        if(fb!=null && fb.isVisible()){

            fb.changeData(index);
        }
        else{

            Intent i=new Intent(this,AnotherActivity.class);
            i.putExtra("index",index);
            startActivity(i);

        }

    }

*/


}
