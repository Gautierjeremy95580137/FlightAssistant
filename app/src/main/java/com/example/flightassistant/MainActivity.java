package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAbout();
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCharts();
            }
        });
    }

    private void goToAbout() {
        final Intent intentAbout = new Intent(this, AboutActivity.class);
        startActivity(intentAbout);
    }

    private void goToCharts() {
        final Intent intentCharts = new Intent(this, ChartsActivity.class);
        startActivity(intentCharts);
    }


}
