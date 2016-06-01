package com.example.adityaputra.newpenyakitanjing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_screen, menu);
        return true;
    }
    public void kembali(View view) {
        Intent intent = new Intent(About.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
