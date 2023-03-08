package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ListView lv;
    String[] cantante = {"Brian Johnson","James Hetfield","Axl Rose","Robert Calvert","Gene Simmons","Mick Fleetwood","Robert Plant","Eric Bloom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.txtTitle);

        lv = findViewById(R.id.list);
        String[] grupos = getResources().getStringArray(R.array.grupos);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.filas, grupos);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String marked = (String) lv.getItemAtPosition(i);
                tv.setText("Del grupo "+marked+" el cantante es \n"+cantante[i]);
            }
        });

    }
}