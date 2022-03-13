package com.syntexpro.basics;

public class ForLoop {

    public static void main(String[] args) {

        int age;
        int range = 10;


        for (age = 1; age <= range; age++) {
            System.out.println(age +" : " + "Java");
        }

        //i = 1
        //1 <= 5; = true
        // body of the loop print = 1

        //i++; below meaning=

        //i= 1+1= 2
        // 2 <= 5; = true
        // body of the loop print = 2

        //i= 2+1= 3
        // 3 <= 5; = true
        // body of the loop print = 3

        //i= 3+1= 4
        // 4 <= 5; = true
        // body of the loop print = 4


        //i= 4+1= 5
        // 5 <= 5; = true
        // body of the loop print = 5

        //i= 5+1= 6
        // 6 <= 5; = false
        // body of the loop terminated


    }


}
