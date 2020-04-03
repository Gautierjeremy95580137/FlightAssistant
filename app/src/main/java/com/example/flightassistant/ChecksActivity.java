package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChecksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checks);

        Button bairbus = findViewById(R.id.button8);
        bairbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAirbus();
            }

        });
        Button bBoeing = findViewById(R.id.button9);
        bBoeing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBoeing();
            }
        });


    }
    //fonctions pour lancer les activité de checklist boeing
    public void goToBoeing(){
        Intent intent = new Intent(this, BoeingActivity.class);
        startActivity(intent);

    }

    //fonctions pour lancer les activité de checklist airbus
    public void goToAirbus(){
        Intent intent = new Intent(this, AirbusActivity.class);
        startActivity(intent);
    }
}
