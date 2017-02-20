package com.example.irwancannady.segalatester;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AddListView extends AppCompatActivity {

    private ArrayList<String> arrayList = new ArrayList<>();
    String[] a = {"1","2","3"};
    ArrayAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_view);

        arrayList.add("one");
        arrayList.add("dua");
        arrayList.add("tiga");
        arrayList.add("empat");

        listView = (ListView) findViewById(R.id.list);
        Button btn = (Button) findViewById(R.id.button11);

        adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, a);
        listView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //untuk replace isi array menrut index ke "0"~~~~
                arrayList.set(0,"satu diganti one");
                arrayList.add("enam");
                adapter.notifyDataSetChanged();
            }
        });

    }
}
