package com.example.demo;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "How much is 5 + 2", "3", "4", "5", "7","7");
        questions[1] = new Question(2, "How much is 1 + 2", "3", "4", "5", "7","3");
        questions[2] = new Question(3, "How much is 3 + 3", "6", "4", "5", "7","6");
        questions[3] = new Question(4, "How much is 18 + 2", "20", "4", "15", "7","20");
        questions[4] = new Question(5, "How much is 18 - 22", "-13", "-4", "0", "7","-4");
    }
    public void playQuiz() {
        int i = 0;
        for (Question q : questions){
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();

            i++;
        }
    }

    public void printScore() {
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            String userAnswer = selection [i];
            Question que = questions[i];
            String answer = que.getAnswer();

            if(userAnswer.equals(answer)){
                score ++;
            }
        }
        System.out.println(score);
    }
}