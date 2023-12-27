package com.basics;


import java.util.function.Predicate;

//This is like an Boolean value returning Function
public class Predicates {
    public static void main(String[] args) {
        System.out.println(passwordCorrect.equals("hello"));
        System.out.println(passwordCorrect.test("Nanthanda"));
        System.out.println(passwordCorrect.equals("Nanthanda"));
   //The above equals not works for this process ,only test() works
    }

    static Predicate<String> passwordCorrect = password ->
            password.equals("Nanthanda") ;
}
