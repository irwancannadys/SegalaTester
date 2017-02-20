package com.example.irwancannady.segalatester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.irwancannady.cannadys.Tester;

import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main4Activity extends AppCompatActivity {

    private ArrayList<Integer> ara = new ArrayList<Integer>(4);
    private TextView textView;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView = (TextView) findViewById(R.id.textView3);
        btn6 = (Button) findViewById(R.id.button6);

        textView.setText("Jam : " + DateFormat.format("hh:mm", System. currentTimeMillis()));

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar1 = Calendar.getInstance();
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd/M/yyyy");
                String currentDate = formatter1.format(calendar1.getTime());

                Calendar calendar2 = Calendar.getInstance();
                SimpleDateFormat formatter2 = new SimpleDateFormat("h:mm");
                String currentTime = formatter2.format(calendar2.getTime());

                Toast.makeText(Main4Activity.this, currentTime, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
