package com.kaytec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 32;
        int y = 0;

        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));

//        int z = getInt();
        int z = getIntLBYL();
        System.out.println("z is " + z);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid =false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        } else {
            return 0;
        }
    }
    private static int divideLBYL(int x, int y) {
        System.out.println("entered lbyl...");
        // look before you leap
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }
    private static int divideEAFP(int x, int y) {
        System.out.println("entered eafp...");
        // easier to ask for forgiveness than permission
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
    private static int divide(int x, int y) {
        System.out.println("blindly dividing...");
        return x / y;
    }
}
