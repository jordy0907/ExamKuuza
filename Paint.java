package com.example.kuuzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Paint extends AppCompatActivity {


    MyCanvas myCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCanvas = new MyCanvas(this,null);
        setContentView(myCanvas);
    }
}
