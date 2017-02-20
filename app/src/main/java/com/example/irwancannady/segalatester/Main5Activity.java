package com.example.irwancannady.segalatester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    int a = 0;
    private Button button, buttonhasil;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button = (Button) findViewById(R.id.button7);
        buttonhasil = (Button) findViewById(R.id.button9);
        hasil = (TextView) findViewById(R.id.textView5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                a = a + 1;
//                hasil.setText("" + a);
                tambah();
                displayHasil(a);

                buttonhasil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        int b = 5;
                        int hasil = a * b;
                        Toast.makeText(Main5Activity.this, "hasil nya : "+ hasil, Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }

    private void displayHasil(int number){
        hasil.setText("" + number);
    }

    public void tambah(){
        a = a + 1;
    }

    public void kurang(){
        a = a - 1;
    }
}
