package com.example.smashrows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InserDocument extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inser_document);
    }

    //Button Back --> MainLayout
    public void back(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}