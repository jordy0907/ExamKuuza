package com.example.kuuzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class page4 extends AppCompatActivity {

    ImageView nav4;
    Button bt4;
    Button bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        nav4 = findViewById(R.id.nav4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                envoyer();
            }
        });
        nav4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page4.this, page2.class);
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                send();
            }
        });

        View btnautre = findViewById(R.id.btnapp);
        btnautre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page4.this, AutreFonction.class);
                startActivity(intent);
            }
        });
    }

    void envoyer() {
        Intent intent = new Intent(page4.this, page5.class);
        startActivity(intent);
    }

    void send() {
        Intent intent = new Intent(page4.this, page6.class);
        startActivity(intent);
    }
}