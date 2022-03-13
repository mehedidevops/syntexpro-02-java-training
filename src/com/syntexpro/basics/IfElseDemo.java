package com.syntexpro.basics;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        int c = 5;

        if ((a > b) &&  (c > b)) { //true || false  = True
            System.out.println("Welcome to My Calculator");

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter another number");
            int enterNumber2 = input.nextInt();

            System.out.println("Please enter a whole number");
            int enterNumber1 = input.nextInt();



            int addition = enterNumber1 + enterNumber2;
            System.out.println("Total Calculation was = " + addition);

        } else {
            System.out.println("Don't do Mathematics");
        }



    }

}
