package com.ibb.bootcamp.week_2.java_8_features;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(String.format("Toplam: %d",(a+b)));
        biConsumer.accept(777,666);
    }
}
