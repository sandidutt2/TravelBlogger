package com.example.travelblogger;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    TextView popularCities;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popularCities=(TextView) findViewById(R.id.popular_cities);




        drawerLayout=findViewById(R.id.drawer_layout);
        drawerToggle=new ActionBarDrawerToggle(MainActivity.this,drawerLayout,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }




    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id=item.getItemId();
        if(id==R.id.login){
            Toast.makeText(this,"Settings is selected!",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.profile) {
            Toast.makeText(this, "Home is selected!", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.settings){
            Toast.makeText(this,"Settings is selected!",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.share) {
            Toast.makeText(this, "Home is selected!", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.rate){
            Toast.makeText(this,"Settings is selected!",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.travel_history){
            Toast.makeText(this,"Settings is selected!",Toast.LENGTH_SHORT).show();
        }

        return false;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}
