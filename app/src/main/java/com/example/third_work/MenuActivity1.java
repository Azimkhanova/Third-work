package com.example.third_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity1 extends AppCompatActivity implements View.OnClickListener {

    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }



    @Override
    public void onClick(View view){
        Intent menu1 = new Intent(this, MenuActivity.class);
        startActivity(menu1);

    }
}

