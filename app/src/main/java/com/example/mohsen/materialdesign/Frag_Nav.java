package com.example.mohsen.materialdesign;


import android.drm.DrmStore;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;

import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Toolbar;

import static com.example.mohsen.materialdesign.R.*;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Nav extends Fragment {

private DrawerLayout mDrawerLayout;
private ActionBarDrawerToggle mActionBarDrawerToggle;
    public Frag_Nav() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(layout.fragment_frag__nav, container, false);
    }

    public void install(DrawerLayout drawerLayout, final Toolbar toolbar) {
        mDrawerLayout=drawerLayout;
        mActionBarDrawerToggle=new ActionBarDrawerToggle
                (getActivity(),drawerLayout,toolbar,string.open,string.close)
        {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                if(slideOffset<.5){
                    toolbar.setAlpha(1-slideOffset);
                }
            }
        };
        mDrawerLayout.setDrawerListener(mActionBarDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mActionBarDrawerToggle.syncState();
            }
        });

    }
}
