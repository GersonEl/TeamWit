package com.unamxhacks.healthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Padecimientos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padecimientos);
        Button b1 = findViewById(R.id.menu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        Spinner sp = (Spinner) findViewById(R.id.sp1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.padecimientos));
        myAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp.setAdapter(myAdapter);
        //sp.setOnItemSelectedListener(new OnItemSelectedListener() {

            //@Override
            /*public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id)
            {
                Toast.makeText(adapterView.getContext(),
                        (String) adapterView.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {    })};*/
    }

}