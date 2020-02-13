package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Starting_Game();

        Random random = new Random();
        ArrayList<GameResult> leaders = new ArrayList<>();
        do {
            System.out.println("What is your name?");
            String name = scan.next();
            System.out.println("Hello, " + name + "!");
            System.out.println("In this game you need to guess the number from 1-100 ");
            var Howmanytries = 10;//tries();
            int myNumber = random.nextInt(100) + 1;
            System.out.println("Cheat: " + myNumber);


            for (int i = 0; i < Howmanytries; i++) {
                int userNumber = askGuess();

                if (myNumber == userNumber) {
                    GameResult r = new GameResult();
                    r.name = name;
                    r.HowManyTries = Howmanytries;
                    r.triesCount = i + 1;
                    leaders.add(r);
                    System.out.println("Congratulations, you win " + name + "!");
                    break;
                }
                if (i == Howmanytries - 1) {
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
        } while (askAnotherGame());
        System.out.println("Leaderboard");
        for (GameResult r : leaders) {

            System.out.printf("User name:%s   Tries of %d - %d %n",r.name, r.HowManyTries, r.triesCount);
        }
        System.out.println("Good bye");
    }


    static boolean askAnotherGame() {
        for (; ; ) {
            String answer = scan.next();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Starting  new the game");
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Enter Yes or No");
            }
        }

    }

    static int askGuess() {
        for (; ; ) {
            try {
                System.out.println("Enter your guess");
                int num = scan.nextInt();
                if (num >= 1 & num <= 100) {
                    return num;
                } else {
                    System.out.println("Enter the number from 1-100");
                }


            } catch (InputMismatchException wrong_input) {
                String str = scan.next();
                System.out.println(str + " isn't number");

            }

        }
    }

    static void Starting_Game() {
        System.out.println("Want to play?");
        boolean T_F = askAnotherGame();
        if (!(T_F)) {
            System.out.println("Good bye!");
            System.exit(1);
        }
    }


    static int tries() {
        System.out.println("How many tries you want? Enter the number");
        return scan.nextInt();
    }


}


























