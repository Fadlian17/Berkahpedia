package com.alfansyah.multidaya.berkahpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("On Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("ON Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("ON RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("ON DESTROY");
    }

    public void NextActivity(View view) {
        Intent intent = new Intent(
          MainActivity.this,SecondActivity.class
        );
        startActivity(intent);
    }
}