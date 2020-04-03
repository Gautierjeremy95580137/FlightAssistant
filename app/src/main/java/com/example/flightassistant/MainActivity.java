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

        //declaration des boutton et des listeners
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

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToConv();
            }
        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTod();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCheck();
            }
        });
    }
    //fonctions vers l'activité about
    private void goToAbout() {
        final Intent intentAbout = new Intent(this, AboutActivity.class);
        startActivity(intentAbout);
    }
    //fonctions vers l'activité de la liste de aérodrome
    private void goToCharts() {
        final Intent intentCharts = new Intent(this, ChartsActivity.class);
        startActivity(intentCharts);
    }
    //fonctions vers l'activité des checklist
    private void goToCheck(){
        final Intent intentChecks = new Intent(this,ChecksActivity.class);
        startActivity(intentChecks);
    }
    //fonctions vers l'activité du Top Of Descent
    private void goToTod(){
        final Intent intentTod = new Intent(this,TodActivity.class);
        startActivity(intentTod);
    }
    //fonctions vers l'activité des conversions
    private void goToConv(){

        final Intent intentConv = new Intent(this,ConvActivity.class);
        startActivity(intentConv);
    }


}
