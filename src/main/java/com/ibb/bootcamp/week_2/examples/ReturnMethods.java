package com.ibb.bootcamp.week_2.examples;

public class ReturnMethods {

    // 3-) Return lu parametresiz
    public String metotReturluParametresiz() {
        return "metot Returnlu Parametresiz";
    }


    // 4-) Return lu parametreli
    public Integer metotReturluParametreli(int number) {
        return number;
    }

    // PSVM
    public static void main(String[] args) {
        ReturnMethods isReturn1 = new ReturnMethods();

        String result1 = isReturn1.metotReturluParametresiz();
        System.out.println(result1);

        Integer result2 = isReturn1.metotReturluParametreli(123456);
        System.out.println(result2);
    }

}