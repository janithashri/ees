package com.example.ees;

import java.util.List;
import android.os.Bundle;
import android.content.Intent;

import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class VideoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
    Button b1,b2,b3,b4;
    b1=(Button)findViewById(R.id.b1);
    b3=(Button)findViewById(R.id.b3);
    b2=(Button)findViewById(R.id.b2);
    b4=(Button)findViewById(R.id.b4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, b3Activity.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, b4Activity.class);
                startActivity(intent);
            }
        });
    b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, b2Activity.class);
                startActivity(intent);
            }
    });
    b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivity.this, b1Activity.class);
                startActivity(intent);
            }
    });


    }
}
