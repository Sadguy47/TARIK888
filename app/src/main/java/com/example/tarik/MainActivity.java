package com.example.tarik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        Log.e("RRRRRRRRRRRRRRRRRRRRRRRRRR",("onCreate"));

    }
}


