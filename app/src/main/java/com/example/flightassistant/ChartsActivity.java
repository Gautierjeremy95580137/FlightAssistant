package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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
