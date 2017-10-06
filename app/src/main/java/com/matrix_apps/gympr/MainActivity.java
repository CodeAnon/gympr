package com.matrix_apps.gympr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gymSelect(View view) {
        Intent gymSelected = new Intent(this, GymStats.class);
        startActivity(gymSelected);
    }
}
