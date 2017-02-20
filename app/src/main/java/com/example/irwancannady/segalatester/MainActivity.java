package com.example.irwancannady.segalatester;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Button btn, btn2, btn3, btn4, btn5, btn6, btn10, btn12intent, btn13;
    private EditText editText;


    @BindView(R.id.button13)
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("hai");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "hihi", Toast.LENGTH_SHORT).show();
            }

        });
        alert.show();

        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.buttonjam);
        btn6 = (Button) findViewById(R.id.button8);
        btn10 = (Button) findViewById(R.id.button10);
        btn12intent = (Button) findViewById(R.id.button12);
        editText = (EditText) findViewById(R.id.editText3);

        intentSaya();
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main5Activity.class));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main4Activity.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("Connecting");
                progressDialog.setMessage(getString(R.string.tester));
                progressDialog.show();

                Runnable progressRunnable = new Runnable() {

                    @Override
                    public void run() {
                        progressDialog.cancel();
                    }
                };

                Handler pdCanceller = new Handler();
                pdCanceller.postDelayed(progressRunnable, 3000);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.toast), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void addListView(View v){

        startActivity(new Intent(getApplicationContext(), AddListView.class));
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }

    private void intentSaya(){

        btn12intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = editText.getText().toString();
                Intent intent = new Intent(getApplicationContext(), GetIntent.class);
                intent.putExtra("irwan",a);
                intent.putExtra("irwana", "tester value");
                startActivity(intent);

            }
        });

    }

    @OnClick(R.id.button13)
    public void tester(){
        Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show();
    }

}
