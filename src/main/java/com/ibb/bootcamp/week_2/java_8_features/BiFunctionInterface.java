package com.ibb.bootcamp.week_2.java_8_features;

import java.util.function.BiFunction;

public class BiFunctionInterface implements BiFunction<Integer,Integer,Integer> {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer + integer2;
    }

    public static void main(String[] args) {
        BiFunctionInterface bifi = new BiFunctionInterface();
        BiFunction<Integer,Integer,String> bifiLambda = (firstNum,secondNum) -> ("Sonuç:"+(firstNum + secondNum));
        System.out.println(bifi.apply(10,20));
        System.out.println(bifiLambda.apply(10,20));
    }
}
