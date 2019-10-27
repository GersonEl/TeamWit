package com.unamxhacks.healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Consulta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta3);
        Button b1_SI = findViewById(R.id.button10);
        b1_SI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Consulta4.class);
                startActivity(intent);
            }
        });
        Button b1_NO = findViewById(R.id.button11);
        b1_NO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Consulta4.class);
                startActivity(intent);
            }
        });
    }
}
