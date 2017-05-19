package com.example.amit.simple3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    Adapter adapter;


    String[] data={"amit","pranjul"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=(RecyclerView)findViewById(R.id.rcv);
        LinearLayoutManager llm=new LinearLayoutManager(MainActivity.this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rc.setLayoutManager(llm);
        adapter=new Adapter(MainActivity.this,data) ;
        rc.setAdapter( adapter);


    }
}
