package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToastClick(View view) {

        //메세지박스 띄우기
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }
}