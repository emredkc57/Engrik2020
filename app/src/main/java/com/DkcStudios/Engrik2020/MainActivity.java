package com.DkcStudios.Engrik2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.DkcStudios.Engrik2020.adapter.RecyclerView_Adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements RecyclerView_Adapter.MyListener {

    static String[] letters = {"A letter","B Letter","C Letter","D Letter","E Letter"
    ,"F Letter", "G Letter"};

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


        letterList = new ArrayList<>(Arrays.asList(letters));


        RecyclerView_Adapter recyclerViewAdapter = new RecyclerView_Adapter(letterList,this,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(recyclerViewAdapter);



    }


    @Override
    public void CallBack(int position) {

        Toast.makeText(this,String.valueOf(position),Toast.LENGTH_LONG).show();


        System.out.println(position);

    }
}