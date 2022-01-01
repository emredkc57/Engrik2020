package com.DkcStudios.Engrik2020.wordanswer;

import com.DkcStudios.Engrik2020.QuizActivity;

public class WordClass {


    String[] A_WordList = {"Adjourn","Agile"};


    public void determineWhichLettersChosen(String[] letters, int position) {

        QuizActivity quizActivity = new QuizActivity();
        letters = LetterClass.letters;


        quizActivity.wordText.setText(letters[position]);


    }


}
