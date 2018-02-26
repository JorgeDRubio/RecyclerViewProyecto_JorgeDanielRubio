package com.example.jorge.recyclerviewproyecto_jorgedanielrubio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<music> musicList;

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        musicList = new ArrayList<>();

        musicList.add(
                new music(
                        1,
                        "Regueton",
                        "una lady",
                        "Compra",
                        R.drawable.chivas, Color.BLUE
                )
        );
        musicList.add(
                new music(
                        1,
                        "Regueton",
                        "una lady",
                        "Compra",
                        R.drawable.chivas, Color.WHITE
                )
        );
        musicList.add(
                new music(
                        1,
                        "Regueton",
                        "una lady",
                        "Compra",
                        R.drawable.chivas, Color.RED
                )
        );
        musicList.add(
                new music(
                        1,
                        "Regueton",
                        "una lady",
                        "Compra",
                        R.drawable.chivas, Color.YELLOW
                )
        );
        musicList.add(
                new music(
                        1,
                        "Regueton",
                        "una lady",
                        "Compra",
                        R.drawable.chivas,Color.GREEN
                )
        );
        musicList.add(
                new music(
                        1,
                        "Regueton",
                        "una lady",
                        "Compra",
                        R.drawable.chivas,Color.GRAY
                )
        );


        musicAdapter adapter = new musicAdapter(this,musicList);
        recyclerView.setAdapter(adapter);

    }
}
