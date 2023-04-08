package com.quizapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        quiz.logic();

    }
}

class Quiz {

    Scanner scanner = new Scanner(System.in);
    int correctAnswerCount=0;
    int wrongAnswerCount=0;

    public void logic() {

        Questions q1 = new Questions("1. Number of primitive data types in Java are? ", "A. 6 ", "B. 7 ", "C. 8 ", "D. 9 ");
        Questions q2 = new Questions("2. What is the size of float and double in java? ", "A. 32 and 64 ", "B. 32 and 32 ", "C. 64 and 32 ", "D. 64 and 64");
        Questions q3 = new Questions("3. Automatic type conversion is possible in which of the possible cases?", "A. Byte to int ", "B. Int to long ", "C. Long to int ", "D. Short to int ");
        Questions q4 = new Questions("4. Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class. ",
                "A. final ", "B. static ", "C. volatile ", "D. abstract ");
        Questions q5 = new Questions("5. compareTo() returns ", "A. True ", "B. False ", "C. An int value ", "D. None ");

        Map<Questions, Character> map = new HashMap<>();
        map.put(q1, 'C');
        map.put(q2, 'A');
        map.put(q3, 'B');
        map.put(q4, 'B');
        map.put(q5, 'C');

        for (Map.Entry<Questions, Character> a : map.entrySet()) {
            System.out.println(a.getKey().getQuestion());
            System.out.println(a.getKey().getOption1());
            System.out.println(a.getKey().getOption2());
            System.out.println(a.getKey().getOption3());
            System.out.println(a.getKey().getOption4());

            System.out.println("Enter your Answer : ");
            Character answer = scanner.next().toUpperCase().charAt(0);
            int compare = Character.compare(answer, a.getValue());
            if (compare == 0) {
                System.out.println("Correct");
                correctAnswerCount++;
            } else {
                System.out.println("Wrong");
                wrongAnswerCount++;
            }

        }
        System.out.println();
        System.out.println("----Result----");
        System.out.println("Total no. of questions "+ map.size());
        System.out.println("Correct Answered Questions "+ correctAnswerCount);
        System.out.println("Wrong Answered Questions "+ wrongAnswerCount);
        int percentage = (100*correctAnswerCount)/ map.size();
        System.out.println("Percentage : "+ percentage);
        if(percentage>95){
            System.out.println("Performance : very good");
        } else if (percentage<35) {
            System.out.println("Performance : very low");
        }else{
            System.out.println("Performance : medium");
        }
    }

}

