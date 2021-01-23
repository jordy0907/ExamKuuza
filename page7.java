package com.example.kuuzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class page7 extends AppCompatActivity {


        EditText ufirstname, uemail, upassword;
        Button btnRegister;
        TextInputLayout userFristNameWrapper, userEmailWrapper, userPasswordWrapper;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_page7);

            ufirstname=findViewById(R.id.userFristName);
            uemail=findViewById(R.id.userEmailAddress);
            upassword=findViewById(R.id.userPassword);


            userFristNameWrapper=findViewById(R.id.userFristNameWrapper);
            userEmailWrapper=findViewById(R.id.userEmailAddressWrapper);
            userPasswordWrapper=findViewById(R.id.userPasswordWrapper);

            btnRegister=findViewById(R.id.btnRegister);

            btnRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String firstname=ufirstname.getText().toString().trim();
                    String email=uemail.getText().toString().trim();
                    String password=upassword.getText().toString().trim();

                    if(firstname.isEmpty()){
                        userFristNameWrapper.setError("Entrer votre nom");
                        userFristNameWrapper.requestFocus();
                        return;
                    }
                    if(email.isEmpty()){
                        userEmailWrapper.setError("Entrer votre mail");
                        userEmailWrapper.requestFocus();
                        return;
                    }
                    if(password.isEmpty()){
                        userPasswordWrapper.setError("Entrer votre mot de passe");
                        userPasswordWrapper.requestFocus();
                        return;
                    }
                    Intent intent= new Intent(page7.this, page4.class);
                    startActivity(intent);
                }
            });

        }
    }


