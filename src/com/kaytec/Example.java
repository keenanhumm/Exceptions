package com.kaytec;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }  catch (NoSuchElementException | ArithmeticException e) {
            System.out.println("Unable to perform division!");
        }
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x: " + x + ", y: " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner s  = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("Please enter a valid number using digits 0 to 9!");
            }
        }
    }
}
