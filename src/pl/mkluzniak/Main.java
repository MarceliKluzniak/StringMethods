package pl.mkluzniak;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = "robo";
//        boolean result = name.equalsIgnoreCase("Bro"); //string to check if name is the same with ignoring of capital letters
//        int result = name.length(); //string to count how many letters are in name
//        char result = name.charAt(1);//string to check what letter is on place nr 1. Count starts from 0
//        int result = name.indexOf("b");//string to check where is letter
//        boolean result = name.isEmpty();//string to check if name input is empty
//        String result = name.toUpperCase(Locale.ROOT);//string to change all letters to upper case
//        String result = name.toLowerCase(Locale.ROOT);//string to change all letters to lower case
//        String result= name.trim();//string to cut every empty space when input name have spaces
        String result = name.replace('o','a');//string to replace every letter in name


        System.out.println(result);


    }
}
