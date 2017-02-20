package com.example.irwancannady.segalatester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

public class GetIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_intent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = (TextView) findViewById(R.id.textView4);

        Intent a = getIntent();
        textView.setText(a.getStringExtra("irwan"));

        String ab = a.getStringExtra("irwana");
        Toast.makeText(this, ab , Toast.LENGTH_SHORT).show();


    }

}
