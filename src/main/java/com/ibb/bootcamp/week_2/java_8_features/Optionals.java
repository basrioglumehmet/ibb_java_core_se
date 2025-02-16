package com.ibb.bootcamp.week_2.java_8_features;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String value = "basrioglumehmet@gmail.com";
        String nullableValue = null;
        Optional<Object> emptyOptional = Optional.empty();
        Optional<String> email = Optional.of(value);
        Optional<String> emptyEmail = Optional.ofNullable(value);
        System.out.println(emptyOptional);
        System.out.println(email);
        System.out.println(emptyEmail);

        String defaultOptionalValue = (String) emptyOptional.orElseGet(() -> "boş");
//        emptyOptional.orElseThrow(() -> new IllegalArgumentException("Email boş olamaz!"));
        email.ifPresent((s) -> System.out.println("Email adresi mevcut!"));

        System.out.println(defaultOptionalValue);

        if(email.isPresent() || !email.isEmpty()){
            System.out.println(email.get());//Get Value
        }
        else{
            System.out.println("No value present");
        }
    }
}
