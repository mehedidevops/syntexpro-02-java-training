package com.syntexpro.basics;

public class PicnicApplication {

    public static void main(String[] args) {

        SummerPicnic picnic = new SummerPicnic("Rifat", 1231231234, 200);
        SummerPicnic picnic1 = new SummerPicnic("Obaid", 1231231234, 200);
        System.out.println(picnic.name + " " + picnic.cellPhone + " " + picnic.picnicChada);
        System.out.println(picnic1.name + " " + picnic1.cellPhone + " " + picnic1.picnicChada);
    }
}
