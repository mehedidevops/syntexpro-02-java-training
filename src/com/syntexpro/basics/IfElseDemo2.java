package com.syntexpro.basics;

public class IfElseDemo2 {

    public static void main(String[] args) {

        int a = 20;
        int b = 5;
        int c = 3;

        //nested if else
        if ((a > b) && (a > c)) {
            System.out.println("Sazin cook biryani");
            System.out.println("Biryani was excellent");

        } else if (a == b) {
            System.out.println("Sazin cook pasta");

        } else if (b == a) {
            System.out.println("Sazin cook chiken biryani");

        } else if (a > b) {
            System.out.println("Sazin cook mutton biryani");

        } else {
            System.out.println("Sazin no cook");
        }

    }


}
