package com.example.iiatimd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OverviewActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        Button jaar1Button = findViewById(R.id.jaar1Button);
        jaar1Button.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent toMainIntent = new Intent(this, MainActivity.class);
        startActivity(toMainIntent);
    }
}