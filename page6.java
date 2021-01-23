package com.example.kuuzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page6 extends AppCompatActivity {

    ImageView nav4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        nav4 = findViewById(R.id.nav4);
        nav4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(page6.this, page2.class);
                startActivity(intent);
            }
        });

        View btncal = findViewById(R.id.btncal);
        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page6.this,Photo.class);
                startActivity(intent);
            }
        });
    }
}
