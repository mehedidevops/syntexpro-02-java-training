package com.syntexpro.basics;

public class IfElseDemo1 {

    public static void main(String[] args) {

        String str1 = "jeff";
        String str2 = "jeff";
        String str3 = new String("jeff"); // to declare
        String str10 = new String("jeff");
        System.out.println("-----------------Using == Operator ----------------");
        // using == operator use for Reference Comparing instead of content comparison.
        if (str1 == str2) { // equal and if Condition True because both have same Referenced Memory address.
            System.out.println("Str1 And Str2 Equal");
        }
        if (str1 == str3) { // Not Equal If Condition False Because == operator compares objects Reference.
            System.out.println("Str1 and Str3 are equals");
        }
        if (str10 == str3) { // Not Equal If Condition False Because == operator compares objects Reference.
            System.out.println("Str10 and Str3 are equals");
        }

        System.out.println("-----------------Using .equal Method----------------");
        // Using .equals Method. for String Content Comparison.

        if (str1.equals(str2)) { // equal and if Condition True because both have same string
            System.out.println("Str1 And Str2 Equal");
        }
        if (str1.equals(str3)) { // Equal If Condition true String have same Content.
            System.out.println("Str1 and Str3 are equals");
        }
        // compare two strings difference
        System.out.println("-----------------Using Compare Method----------------");
        // first string.toCompare(String2)

        System.out.println(str1.compareTo(str2));

    }
}


