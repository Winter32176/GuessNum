package com.company;

import java.util.ArrayList;
import java.util.Random;


public class Main {


    public static void main(String[] args) {
        //   Starting_Game();

        Random random = new Random();
        ArrayList<GameResult> leaders = new ArrayList<>();

        do {
            String name = Name();

            System.out.println("In this game you need to guess the number from 1-100 ");
            var totalNumberOfAttempts = Asker.totalNumberOfAttempts();

            long t1 = System.currentTimeMillis();

            int myNumber = random.nextInt(100) + 1;
            System.out.println("Cheat: " + myNumber);


            for (int i = 0; i < totalNumberOfAttempts; i++) {
                int userNumber = Asker.askGuess();
                if (myNumber == userNumber) {
                    long t2 = System.currentTimeMillis();
                    long time = t2 - t1;
                    GameResult r = new GameResult();
                    r.name = name;
                    r.totalNumberOfAttempts = totalNumberOfAttempts;
                    r.AttemptsCount = i + 1;
                    r.time = time;
                    leaders.add(r);
                    System.out.println("Congratulations, you win " + name + "!");
                    break;
                }
                if (i == totalNumberOfAttempts - 1) {
                    System.out.println("You lose " + name + "!");
                    System.out.println("Number was: " + myNumber);
                    break;
                }
                if (myNumber > userNumber) {
                    System.out.println("Your number is less");
                } else {
                    System.out.println("Your number is bigger");
                }
            }

            System.out.println("Again?");
        } while (Asker.askAnotherGame());


        Leaderboard(leaders);
    }

    private static String Name() {
        System.out.println("What is your name?");
        String name = Asker.scan.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    private static void Leaderboard(ArrayList<GameResult> leaders) {
        System.out.println("Leaderboard");
        int maxLenght = 0;

        for (GameResult r : leaders) {
            if (r.name.length() > maxLenght) {
                maxLenght = r.name.length();
            }
        }
        for (GameResult r : leaders) {
            System.out.printf("Name: %-" + maxLenght + "s %2d attempts out of %2d Time: %3.2f %n", r.name, r.AttemptsCount, r.totalNumberOfAttempts, r.time / 1000.0);
            System.out.println("");
        }

        System.out.println("Good bye");
    }


}


























