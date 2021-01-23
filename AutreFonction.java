package com.example.kuuzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AutreFonction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autre_fonction);

        View song = findViewById(R.id.btnsong);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AutreFonction.this, Music.class);
                startActivity(intent);
            }
        });

        View paint = findViewById(R.id.btnpaint);
        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AutreFonction.this, Paint.class);
                startActivity(intent);
            }
        });

        View map = findViewById(R.id.btnmap);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AutreFonction.this, MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
