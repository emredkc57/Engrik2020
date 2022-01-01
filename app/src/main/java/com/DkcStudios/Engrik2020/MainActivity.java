package com.DkcStudios.Engrik2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.DkcStudios.Engrik2020.adapter.RecyclerView_Adapter;
import com.DkcStudios.Engrik2020.wordanswer.LetterClass;
import com.DkcStudios.Engrik2020.wordanswer.WordClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements RecyclerView_Adapter.MyListener {



    ArrayList<String> letterList;


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initVariables();


    }







    void initVariables() {
        recyclerView = findViewById(R.id.recyclerView);


        letterList = new ArrayList<>(Arrays.asList(LetterClass.letters));


        RecyclerView_Adapter recyclerViewAdapter = new RecyclerView_Adapter(letterList,this,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(recyclerViewAdapter);



    }


    @Override
    public void CallBack(int position) {

     Intent intent = new Intent(MainActivity.this,QuizActivity.class);
     intent.putExtra("position",position);
     startActivity(intent);

    }
}