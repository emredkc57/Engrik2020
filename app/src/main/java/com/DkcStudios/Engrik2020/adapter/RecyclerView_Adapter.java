package com.DkcStudios.Engrik2020.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.DkcStudios.Engrik2020.R;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.RowHolder> implements View.OnClickListener{

    ArrayList<String> letters;
    AppCompatActivity appCompatActivity;
    LayoutInflater layoutInflater;
    MyListener myListener;
    String[] colors = {"#45B39D","#52BE80"
    ,"#EC7063","#F7DC6F","#EB984E","#197BDC","#7F8C8D","#9B59B6"};


    public RecyclerView_Adapter(ArrayList<String> letters, AppCompatActivity appCompatActivity,MyListener myListener) {
        this.letters = letters;
        this.appCompatActivity = appCompatActivity;
        this.myListener = myListener;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        layoutInflater = appCompatActivity.getLayoutInflater();


        View rootView = layoutInflater.inflate(R.layout.row_recycler,parent,false);
        rootView.setOnClickListener(this);




        return new RowHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {

        holder.bind(letters,colors,position);


    }

    @Override
    public int getItemCount() {
        return letters.size();
    }


    @Override
    public void onClick(View v) {

        int pos = (int) v.getTag();

        myListener.CallBack(pos);





    }


    public class RowHolder extends RecyclerView.ViewHolder {

        TextView letterText;


        public RowHolder(@NonNull View itemView) {
            super(itemView);



            letterText = itemView.findViewById(R.id.textView);

        }


        private void bind(ArrayList<String> letters,String[] colors, int position) {

            itemView.setTag(position);

            itemView.setBackgroundColor(Color.parseColor(colors[position%8]));


            letterText.setText(letters.get(position));

        }



    }


    public interface MyListener {

         void CallBack(int position);

    }

}
