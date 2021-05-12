package com.example.listview_ejemplos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewMain);

        List<String> nombres = new ArrayList<String>();
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        nombres.add("Mario");
        nombres.add("Miguel");
        nombres.add("Matias");
        nombres.add("Nicolas");
        nombres.add("Sebastian");
        nombres.add("Andres");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres);
        // enlazar el adaptador con el listView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"clic en "+nombres.get(position),Toast.LENGTH_LONG).show();
            }
        });

        MyAdapter myAdapter = new MyAdapter(this,R.layout.list_item,nombres);
        listView.setAdapter(myAdapter);

    }
}