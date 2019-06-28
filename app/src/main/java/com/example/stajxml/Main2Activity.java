package com.example.stajxml;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.stajxml.taksi.FragmentTaksi;
import com.example.stajxml.tarif.TarifFragment;
import com.google.android.material.navigation.NavigationView;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView navigationView;
    TextView tvUz, tvRu, tvReg;
    private boolean selectUz = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        View header = navigationView.getHeaderView(0);

        tvRu = header.findViewById(R.id.tvRus);
        tvUz = header.findViewById(R.id.tvUz);
        tvReg = header.findViewById(R.id.tvReg);

        tvRu.setOnClickListener(this);
        tvUz.setOnClickListener(this);
        tvRu.setOnClickListener(this);

        tvUz.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.for_fragments, new FragmentTaksi()).commit();
        }

        initNavigationMenu();


    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.search) {
            return true;
        } else if (id == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
        if (id == R.id.tarif) {
            getSupportFragmentManager().beginTransaction().replace(R.id.for_fragments, new TarifFragment()).commit();
        } else if (id == R.id.sob) {
            // Handle the camera action
        } else if (id == R.id.zak) {

        } else if (id == R.id.dob) {

        } else if (id == R.id.infor) {

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initNavigationMenu() {
        ActionBarDrawerToggle actionBarDrawerToggle =
                new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close);
        actionBarDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen(GravityCompat.START))
                    drawer.closeDrawer(GravityCompat.START);
                else drawer.openDrawer(GravityCompat.START);
            }
        });

        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onClick(View v) {
        if (selectUz) {
            ((TextView)v).setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
            ((TextView)v).setTextColor(getResources().getColor(R.color.colorAccent));
            selectUz = false;
        } else {
            ((TextView)v).setPaintFlags(((TextView)v).getPaintFlags());
            selectUz = true;
            ((TextView)v).setTextColor(getResources().getColor(R.color.colorGreen));
        }
    }
}
