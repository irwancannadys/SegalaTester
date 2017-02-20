package com.example.irwancannady.segalatester;

import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);


        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Timer.this);
        alertDialog.setTitle("alert");
        alertDialog.setMessage("00:10");
        alertDialog.show();
        CountDownTimer timer = new CountDownTimer(1000, 100)
        {
            @Override
            public void onTick(long l)
            {
                alertDialog.setMessage("00:"+ (1000/100));

            }

            @Override
            public void onFinish()
            {

            }
        }.start();

    }
}
