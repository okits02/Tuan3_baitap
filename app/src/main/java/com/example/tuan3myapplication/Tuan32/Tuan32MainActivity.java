package com.example.tuan3myapplication.Tuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tuan3myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    Tuan32Adapter adapter;
    ArrayList<Tuan32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.Tuan32Lv);
        ls.add(new Tuan32Contact("Nguyen Van b","20",R.drawable.hancock));
        ls.add(new Tuan32Contact("Nguyen Van a","18",R.drawable.kimheesun));
        ls.add(new Tuan32Contact("Nguyen Van c","17",R.drawable.kimnamjoo));
        ls.add(new Tuan32Contact("Nguyen Van d","19",R.drawable.one65));
        ls.add(new Tuan32Contact("Nguyen Van h","21",R.drawable.shank));
        ls.add(new Tuan32Contact("Nguyen Van k","22",R.drawable.kimtaehee));
        adapter=new Tuan32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}