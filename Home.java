package com.example.mydocfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton doctor = (ImageButton) findViewById(R.id.doctor);
        doctor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(Home.this,Doctors.class);
                startActivity(intent);
            }
        });

        ImageButton author = (ImageButton) findViewById(R.id.author);
        author.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(Home.this,About.class);
                startActivity(intent);
            }
        });

        ImageButton call = (ImageButton) findViewById(R.id.videocall);
        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(Home.this,VideoCall.class);
                startActivity(intent);
            }
        });

        ImageButton prescription = (ImageButton) findViewById(R.id.prescription);
        prescription.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(Home.this,Medicine.class);
                startActivity(intent);
            }
        });

        ImageButton sample = (ImageButton) findViewById(R.id.samplecheck);
        sample.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                Intent intent = new Intent(Home.this,Sample.class);
                startActivity(intent);
            }
        });
    }
}