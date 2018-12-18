package com.example.mohsen.materialdesign;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Toolbar toolbar;
Button buttonSnack,buttonTab;
    Frag_Nav frag_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.appBar);
        setSupportActionBar(toolbar);

        buttonTab=findViewById(R.id.btnTab);
        buttonTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TabLauot.class));
            }
        });

        frag_nav= (Frag_Nav) getSupportFragmentManager().findFragmentById(R.id.fragmenDrawer);
        frag_nav.install((DrawerLayout)findViewById(R.id.drawerId),toolbar);

        buttonSnack=findViewById(R.id.btnSnack);
        buttonSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Snackbar.make(v,"خوش آمدید",Snackbar.LENGTH_LONG).show();
                Snackbar snackbar=Snackbar.make(v,"خوش آمدید",Snackbar.LENGTH_LONG);
                View view1=snackbar.getView();
                view1.setBackgroundColor(getResources().getColor(R.color.colorBackToolbar));

                snackbar.show();


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idGet=item.getItemId();
        if(idGet== R.id.action_setting){
startActivity(new Intent(MainActivity.this,Setting_Activity.class));
        }
        return super.onOptionsItemSelected(item);




    }
}
