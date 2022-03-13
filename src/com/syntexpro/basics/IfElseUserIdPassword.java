package com.syntexpro.basics;

public class IfElseUserIdPassword {

    public static void main(String[] args) {

        String userId = "java@oracle.com";
        String password = "jdk17";

        //Option 1 (==)
        System.out.println("Option:1 (==)");

        if ((userId == "java@oracle.com") && (password == "jdk17")) {
            System.out.println("Your are successfully logged in");
            System.out.println("Welcome Java World");
        } else {
            System.out.println("Your userId and password was incorrect");
        }

        System.out.println("-----------------------------------------------------");
        //Option 2 (equals)
        System.out.println("Option:2 (equals)");

        if ((userId.equals("java@oracle.com")) && (password.equals("jdk17"))) {
            System.out.println("Your are successfully logged in");
            System.out.println("Welcome Java World");
        } else {
            System.out.println("Your userId and password was incorrect");
        }

        System.out.println("____________________________________________________________");

        //Option = 3  (==)
        System.out.println("Option:3 (==)");

        if (userId == "java@oracle.com") {
            if (password == "jdk17") {
                System.out.println("Your are successfully logged in");
                System.out.println("Welcome Java World");
            } else {
                System.out.println("Your password was incorrect");
            }
        } else {
            System.out.println("Your userId was incorrect");
        }

        System.out.println("____________________________________________________________");

        //Option = 4 (equals)
        System.out.println("Option:4 (equals)");

        if (userId.equals("java@oracle.com")) {
            if (password.equals("jdk17")) {
                System.out.println("Your are successfully logged in");
                System.out.println("Welcome Java World");
            } else {
                System.out.println("Your password was incorrect");
            }
        } else {
            System.out.println("Your userId was incorrect");
        }
    }
}
