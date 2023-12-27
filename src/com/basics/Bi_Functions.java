package com.basics;

import java.util.function.BiFunction;

public class Bi_Functions {
    public static void main(String[] args) {
        BiFunction<Integer ,Integer , Integer> multiplyAndAdd =
                (firstNumber , SecondNumber ) -> firstNumber+1 * SecondNumber*50  ;
        System.out.println(multiplyAndAdd.apply(3 ,3)  );
    }
}
