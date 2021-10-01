package com.example.androidreyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler1);

        list = new ArrayList<>();
        list.add(new Model(R.drawable.image1, "Title 1"));
        list.add(new Model(R.drawable.image2, "Title 2"));
        list.add(new Model(R.drawable.image3, "Title 3"));
        list.add(new Model(R.drawable.image4, "Title 4"));
        list.add(new Model(R.drawable.image1, "Title 5"));
        list.add(new Model(R.drawable.image2, "Title 6"));
        list.add(new Model(R.drawable.image3, "Title 7"));
        list.add(new Model(R.drawable.image4, "Title 8"));
        list.add(new Model(R.drawable.image1, "Title 9"));
        list.add(new Model(R.drawable.image2, "Title 10"));
        list.add(new Model(R.drawable.image3, "Title 11"));
        list.add(new Model(R.drawable.image4, "Title 12"));

        adapter = new Adapter(MainActivity.this, list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);


    }
}