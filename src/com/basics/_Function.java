package com.basics;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Function<Integer , Integer> incrementByOneMultiplyByOne= incrementByOne.andThen(multiplyByOne) ;
        int finalResult = incrementByOneMultiplyByOne.apply(1) ;
        System.out.println(finalResult);
    }
    static Function<Integer , Integer> incrementByOne =
            num -> num +1 ;
    static Function<Integer , Integer> multiplyByOne =
            num -> num*50 ;
}
