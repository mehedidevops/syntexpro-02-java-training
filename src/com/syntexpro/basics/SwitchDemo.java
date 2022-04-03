package com.syntexpro.basics;

import static com.syntexpro.basics.Registration.universityName;

public class SwitchDemo {

    public static void main(String[] args) {

        String name = "Married";

        switch (name) {
            case "Married":
                System.out.println("DMV Insurance discount 50 %");
                System.out.println(universityName);
                break;
            case "Single":
                System.out.println("DMV Insurance discount 100 %");
                break;
            case "MultipleDriver":
                System.out.println("DMV Insurance discount 75 %");
                break;
            default:
                System.out.println("You can not get insurance");





























        }


    }


}


