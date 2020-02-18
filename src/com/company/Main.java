package com.company;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    static LeaderBoard leaderBoard = new LeaderBoard();

    public static void main(String[] args) {
        //Asker.Starting_Game();
        Random random = new Random();

        do {
            String name = Asker.askUserName();
            System.out.println("Hello, " + name + "!");

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
                    leaderBoard.addLeader(r);
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

        leaderBoard.leaderboard1();
    }
}


























