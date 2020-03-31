package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ChartsActivity<MediaAdapter> extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charts);

       final RecyclerView rv = (RecyclerView) findViewById(R.id.RecyclerView);
       rv.setLayoutManager(new LinearLayoutManager(this));
       rv.setAdapter(new MyAdapter());



    }
}
