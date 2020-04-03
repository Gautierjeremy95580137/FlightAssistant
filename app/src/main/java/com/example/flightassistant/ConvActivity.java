package com.example.flightassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConvActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conv);
        Button buttonConvInHg = findViewById(R.id.button7);
        buttonConvInHg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pcaseEditText = findViewById(R.id.editText);
                String dcaseEditText = pcaseEditText.getText().toString();
                    if(dcaseEditText.isEmpty()){
                        Toast.makeText(ConvActivity.this,"",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    float result = Float.parseFloat(dcaseEditText)/33.864f;
                TextView resultTextView = findViewById(R.id.textView13);
                resultTextView.setText(result + "");
            }
        });
    }
}
