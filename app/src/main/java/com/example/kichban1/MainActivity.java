package com.example.kichban1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();

    }
    private void addViews(){
        button2 = findViewById(R.id.button2);
    }
    private void  addEvents(){
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentManhinh2 = new Intent( MainActivity.this,MainActivity2.class );
                startActivity(intentManhinh2);
            }
        });
    }
}