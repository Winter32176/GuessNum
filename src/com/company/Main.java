package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Guess the number from 1-100");

        int myNumber = random.nextInt(100) + 1;
        System.out.println("Cheat: " + myNumber);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your guess");
            int userNumber = scan.nextInt();

            if (myNumber != userNumber) {
                System.out.println("Try again");

                if (myNumber < userNumber) {
                    System.out.println("Your number is bigger");
                } else {
                    System.out.println("Your number is less");
                }

            }

            if (myNumber == userNumber) {
                System.out.println("Congralulations, you win " + name + "!" );
                break;

            }

        }


    }
}
