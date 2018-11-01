package com.example.hrsshuvo.xxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void music(View view) {
        Toast.makeText(this, "Music starr", Toast.LENGTH_SHORT).show();
    }

    public void file(View view) {
        Toast.makeText(this, "Upload file", Toast.LENGTH_SHORT).show();
    }

    public void play(View view) {
        Intent intent = new Intent(this,Mudic.class);
        startActivity(intent);
    }
}
