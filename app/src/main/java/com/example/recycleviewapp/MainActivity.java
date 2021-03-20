package com.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.rv1);
        list.add(new sample(R.drawable.img1,"hi"));
        list.add(new sample(R.drawable.img2,"hello"));
        list.add(new sample(R.drawable.img3,"india"));
        list.add(new sample(R.drawable.img4,"hello"));
        list.add(new sample(R.drawable.img5,"hello"));
        list.add(new sample(R.drawable.img6,"hello"));
        list.add(new sample(R.drawable.img7,"hello"));
        list.add(new sample(R.drawable.img8,"hello"));
        list.add(new sample(R.drawable.img9,"hello"));
        list.add(new sample(R.drawable.img10,"hello"));
        list.add(new sample(R.drawable.img11,"hello"));
        list.add(new sample(R.drawable.img12,"hello"));
        list.add(new sample(R.drawable.img13,"hello"));
        list.add(new sample(R.drawable.img14,"hello"));
        list.add(new sample(R.drawable.img15,"hello"));
        list.add(new sample(R.drawable.img16,"hello"));
        list.add(new sample(R.drawable.img17,"hello"));
        list.add(new sample(R.drawable.img18,"hello"));
        list.add(new sample(R.drawable.img19,"hello"));
        list.add(new sample(R.drawable.img20,"hello"));

         AdapterWallpaper adapterWallpaper= new AdapterWallpaper(list,this);

          // GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
          // recyclerView.setLayoutManager(gridLayoutManager);
       LinearLayoutManager linearLayoutManager=  new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
//        recyclerView.setLayoutManager(linearLayoutManager);
       // StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterWallpaper);

    }
}
