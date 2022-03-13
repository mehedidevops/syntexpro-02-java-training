package com.syntexpro.basics;

public class SwitchDemo3 {

    public static void main(String[] args) {


        double price = 1.99;
        double discount = 0;
        String condition="good";
        switch (condition) {
            case "damaged":
                discount = price * 0.1;
                System.out.println(discount);
                break;
            case "used":
                discount = price*0.2;
                System.out.println(discount);
                break;
            default:
                discount = price;
                System.out.println(discount);
        }


    }

}
