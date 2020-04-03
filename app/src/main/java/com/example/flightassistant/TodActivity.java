package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tod);
        Button bouttonCalcul = findViewById(R.id.button10);
        bouttonCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText vitessSol = findViewById(R.id.editText2);
                String BvitesseSol = vitessSol.getText().toString();
                EditText deltaZ = findViewById(R.id.editText3);
                String BdeltaZ = deltaZ.getText().toString();
                EditText distance = findViewById(R.id.editText4);
                String Bdistance = distance.getText().toString();
                if(BvitesseSol.isEmpty() && BdeltaZ.isEmpty() && Bdistance.isEmpty()){
                    Toast.makeText(TodActivity.this,"",Toast.LENGTH_SHORT).show();
                    return;
                }
                float BvTo = Float.parseFloat(BvitesseSol);
                float BdTo = Float.parseFloat(BdeltaZ);
                float BddTo = Float.parseFloat(Bdistance);
                float result1 = BvTo * BdTo;
                float result2 = 60f*BddTo;
                float result3 = result1 / result2;

                TextView resultTextView = findViewById(R.id.textView16);
                resultTextView.setText(result3 +"");


            }
        });
    }
}
