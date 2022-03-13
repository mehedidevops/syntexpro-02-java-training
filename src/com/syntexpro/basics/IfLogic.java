package com.syntexpro.basics;

public class IfLogic {

    public static void main(String[] args) {

        //Compare String With the Java if Statement Using the == Operator
        //Compare String With the Java if Statement Using the equal() Function/Method

        String a = "234";
        String b = "234";

        // == and equals
        String c = new String("Parakeet");
        String d = new String("Parakeet");

        if (a.equals(b)){
            System.out.println("True");

        }else{
            System.out.println("False");
        }


    }

}
