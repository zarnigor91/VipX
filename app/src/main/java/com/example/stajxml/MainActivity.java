package com.example.stajxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           if(savedInstanceState==null){
               getSupportFragmentManager().beginTransaction().add(R.id.continer,new LoginFragment()).commit();
           }
    }
}
