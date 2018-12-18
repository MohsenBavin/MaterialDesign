package com.example.mohsen.materialdesign;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.Toast;

public class TabLauot extends AppCompatActivity {
private Toolbar toolbar;
TabLayout tabLayout;
ViewPager viewPager;
ViewTabAdapter viewTabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_lauot);
        toolbar=findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
      // getSupportActionBar().setHomeButtonEnabled(true);
       //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        viewTabAdapter=new ViewTabAdapter(getSupportFragmentManager());
        viewTabAdapter.addFragments(new FirstFragment(),"First");
        viewTabAdapter.addFragments(new SecondFragment(),"Second");
        viewTabAdapter.addFragments(new ThirdFragment(),"Third");

        viewPager.setAdapter(viewTabAdapter);
        tabLayout.setupWithViewPager(viewPager);




        }



 /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        Toast.makeText(this,"tabed2",Toast.LENGTH_LONG).show();

        if(id==R.id.homeAsUp){
    //NavUtils.navigateUpFromSameTask(this);
    Toast.makeText(this,"tabed",Toast.LENGTH_LONG).show();
    startActivity(new Intent(this,MainActivity.class));

}
        return super.onOptionsItemSelected(item);

    }
    */
}
