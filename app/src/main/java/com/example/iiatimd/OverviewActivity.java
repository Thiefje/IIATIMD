package com.example.iiatimd;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
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

        Button jaar2Button = findViewById(R.id.jaar2Button);
        jaar2Button.setOnClickListener(this);

        Button jaar34Button = findViewById(R.id.jaar34Button);
        jaar34Button.setOnClickListener(this);

        Button keuzemodulenButton = findViewById(R.id.keuzemodulenButton);
        keuzemodulenButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.jaar1Button:
                Intent toJaar1 = new Intent(this, Jaar1Activity.class);
                startActivity(toJaar1);
                break;

            case R.id.jaar2Button:
                // do your code
                break;

            case R.id.jaar34Button:
                // do your code
                break;

            default:
                break;
        }

    }
}