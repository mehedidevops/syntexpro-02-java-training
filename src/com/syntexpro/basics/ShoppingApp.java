package com.syntexpro.basics;

import com.syntexpro.basics1.Salary;

public class ShoppingApp {

    public static void main(String[] args) {

        Electronics electronics = new Electronics(); //object create/instance
        System.out.println(electronics.laptopName);
        System.out.println(electronics.releaseDate);
        System.out.println(electronics.laptopPrice);
        System.out.println(electronics.specifications);


        HelloInfo helloInfo = new HelloInfo();
        System.out.println(helloInfo.goodMorning);

        Salary salary = new Salary();
        System.out.println(salary.salary);


    }


}
