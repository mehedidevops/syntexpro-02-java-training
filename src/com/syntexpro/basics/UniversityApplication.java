package com.syntexpro.basics;

import static com.syntexpro.basics.Registration.universityName;

public class UniversityApplication {


    public static void main(String[] args) {


        Registration registration1 = new Registration("Obaid", "Programming");
        String finalForm = registration1.studentName
                + ": " + registration1.studentDepartmentName
                + ": " + universityName;
        Registration registration2 = new Registration("Rifat", "English");
        String finalForm2 = registration2.studentName
                + ": " + registration2.studentDepartmentName
                + ": " + universityName;
        System.out.println(finalForm);
        System.out.println(finalForm2);

    }
}
