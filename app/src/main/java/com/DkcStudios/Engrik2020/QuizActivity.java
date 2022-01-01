package com.DkcStudios.Engrik2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.DkcStudios.Engrik2020.wordanswer.LetterClass;
import com.DkcStudios.Engrik2020.wordanswer.WordClass;

public class QuizActivity extends AppCompatActivity {

    public static TextView wordText;
    public EditText answerText;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        wordText = findViewById(R.id.textView2);
        answerText = findViewById(R.id.editTextTextPersonName);

        btn = findViewById(R.id.button);



        initializeActivity();


    }


    void initializeActivity() {

        Intent intent = this.getIntent();

        int receivedPos = intent.getIntExtra("position",0);

        WordClass wordClass = new WordClass();


        wordClass.determineWhichLettersChosen(LetterClass.letters,receivedPos);



    }


}