package com.example.dic_v1.infor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dic_v1.R;

import java.util.ArrayList;

public class words extends AppCompatActivity {
    ListView lv;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        lv=findViewById(R.id.hienthiword);
        arrayList=new ArrayList<String>();
        arrayList.add("ddd");
        adapter=new ArrayAdapter<String>();
        lv.setAdapter(adapter);


    }
}