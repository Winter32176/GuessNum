package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        String ABC="Yes";


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
                } else if (myNumber == userNumber) {
                    System.out.println("Congratulations, you win " + name + "!");
                    QagainORnot();

                }
                if (i == 9) {
                    System.out.println("You lose " + name + "!");
                    System.out.println("Number was: " + myNumber);
                }

            }
        } while(ABC.equals("Yes"));

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

    static String QagainORnot() {
        for (; ; ) {
            System.out.println("Again?");
            String ABC = scan.next();

            if (ABC.equals("No")) {
                return ABC;
            } else if (ABC.equals("Yes")) {
                return ABC;
            } else {
                System.out.println("Enter Yes or No");
            }


        }
    }
}
