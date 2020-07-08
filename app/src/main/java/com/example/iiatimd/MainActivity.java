package com.example.iiatimd;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent toOverviewIntent = new Intent(this, OverviewActivity.class);
        startActivity(toOverviewIntent);
    }

}
