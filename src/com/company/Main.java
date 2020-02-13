package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       // System.out.println("Want to play?");
      //  Game_Start();

        Random random = new Random();

        do {
            System.out.println("What is your name?");
            String name = scan.next();
            System.out.println("Hello, " + name + "!");
            System.out.println("In this game you need to guess the number from 1-100 ");
            var Howmanytries = tries();
            int myNumber = random.nextInt(100) + 1;
            System.out.println("Cheat: " + myNumber);


            for (int i = 0; i < Howmanytries; i++) {
                int userNumber = askGuess();

                if (myNumber == userNumber) {
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
        } while (askAnotherGame());

        System.out.println("Good bye");
    }


    static boolean askAnotherGame() {
        for (; ; ) {
            System.out.println("Again?");
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

    static int tries() {
        System.out.println("How many tries you want? Enter the number");
        return scan.nextInt();
    }

    private static void Game_Start() {
        for (; ; ) {
            String Answer = scan.next();
            if (Answer.equalsIgnoreCase("no")) {
                System.out.println("Good bye!");
                System.exit(1);
            } else if (Answer.equalsIgnoreCase("yes")) {
                System.out.println("Starting  new the game");
                break;
            } else {
                System.out.println("Enter Yes or No");
            }
        }
    }


}


























