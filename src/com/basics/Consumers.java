package com.basics;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
//        printName.accept("Tinesh Sakthi R");
        Consumer<String> printNameAndNameMeaning = printName.andThen(printNameMeaning) ;
        printNameAndNameMeaning.accept("Tinesh Sakthi R");
    }
    static Consumer<String> printName = name ->
            System.out.println(name +",This is Dragon Monkey style") ;
    static Consumer<String> printNameMeaning = name ->
            System.out.println("The meaning of "+name+" is Love") ;

}
