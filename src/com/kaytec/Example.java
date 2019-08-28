package com.kaytec;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("x: " + x + ", y: " + y);
            return x / y;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Not suitable input!");
        } catch(ArithmeticException e) {
            throw new ArithmeticException("Attempt to divide by zero!");
        }
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
