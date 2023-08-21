package com.example.mydocfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        MaterialButton user = (MaterialButton) findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(First.this,MainActivity.class);
                startActivity(intent);
            }
        });

        MaterialButton admin = (MaterialButton) findViewById(R.id.admin);
        admin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(First.this,Admin.class);
                startActivity(intent);
            }
        });

        MaterialButton doctor = (MaterialButton) findViewById(R.id.doctor);
        doctor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(First.this,doctorlogin.class);
                startActivity(intent);
            }
        });
    }
}