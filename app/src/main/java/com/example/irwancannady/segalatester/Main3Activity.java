package com.example.irwancannady.segalatester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button btnHitung;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView2);
        btnHitung = (Button) findViewById(R.id.button5);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = editText1.getText().toString().trim();
                String b = editText2.getText().toString().trim();

                Double c =  Double.parseDouble(a);
                Double d = Double.parseDouble(b);

                if (a.isEmpty() && b.isEmpty()){
                    Toast.makeText(Main3Activity.this, "Tidak Boleh kosong", Toast.LENGTH_SHORT).show();
                } else {

                    double luas = c * d;
                    textView.setText(String.valueOf(luas));
                }

            }
        });

    }
}
