package com.example.demo;

public class Demo {
    public static void main (String []args){
        QuestionService displayQuestion = new QuestionService();
        displayQuestion.playQuiz();
        displayQuestion.printScore();
    }
}
