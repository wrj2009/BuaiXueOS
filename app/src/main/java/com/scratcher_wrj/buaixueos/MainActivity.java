package com.scratcher_wrj.buaixueos;

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
    public void openPreview(View view) {
        Intent intent = new Intent(MainActivity.this, Preview.class);
        startActivity(intent);
    }
    public void openBook(View view) {
        Intent intent = new Intent(MainActivity.this, Book.class);
        startActivity(intent);
    }
    public void wrongQuestions(View view) {
        System.out.println(1 / 0);
    }
}