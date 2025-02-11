package com.ibb.bootcamp.week_1;

public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("Uncle bob");

        // Veri değişken isimlerini yazarken;

        // tam sayılar (4)
        byte b1=127;
        System.out.println("byte: "+b1);

        short s1=32767;
        System.out.println("short: "+s1);

        int i1=2147483647;
        System.out.println("int: "+i1);

        long l1=9223372036854775807L;
        System.out.println("long: "+l1);

        // virgüllü (floating point)
        //Sektörde bankalar tarafından kullanılır
        float f2=3.14f;
        System.out.println("float: "+f2);

        //Sektörde bankalar tarafından kullanılır
        double d2=3.14;
        System.out.println("double: "+d2); // bellekte çok yer kaplar.

        // boolean
        boolean b3=true;
        System.out.println("boolean: "+b3);

        // char
        char c4= '\u4125';
        System.out.println("char: "+c4);


    }
}
