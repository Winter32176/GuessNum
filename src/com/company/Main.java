package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Want to play?");
        Game_Start_OR_Not();
        Random random = new Random();
        do {

            System.out.println("What is your name?");
            String name = scan.next();
            System.out.println("Hello, " + name + "!");
            System.out.println("Guess the number from 1-100");
            int myNumber = random.nextInt(100) + 1;
            System.out.println("Cheat: " + myNumber);


            for (int i = 0; i < 10; i++) {
                int userNumber = askGuess();


                if (myNumber > userNumber) {
                    if (i < 9) System.out.println("Your number is less");
                } else if (myNumber < userNumber) {
                    if (i < 9) System.out.println("Your number is bigger");
                }
                if (myNumber == userNumber) {
                    System.out.println("Congratulations, you win " + name + "!");
                    System.out.println("Again?");
                    Game_Start_OR_Not();
                    break;

                }
                if (i == 9) {
                    System.out.println("You lose " + name + "!");
                    System.out.println("Number was: " + myNumber);
                    System.out.println("Again?");
                    Game_Start_OR_Not();

                }


            }

        } while (true);


    }

    private static void  Game_Start_OR_Not() {
        for (; ; ) {
            String Answer = scan.next();
            if (Answer.equals("No") || Answer.equals("no")) {
                System.exit(1);
            } else if (Answer.equals("Yes") || Answer.equals("yes")) {
                System.out.println("Starting  new the game");
                break;
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


}


























