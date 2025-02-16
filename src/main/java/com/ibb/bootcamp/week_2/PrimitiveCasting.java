package com.ibb.bootcamp.week_2;

public class PrimitiveCasting {
    public static void main(String[] args) {
        //Widening Cast - Implicit Cast (Kapalı) Daha küçük veriyi daha büyük veriye dönüştürme işlemidir
        byte byteNumber = 127; //Küçük veriyi
        int intNumber = byteNumber; //Büyük veriye dönüştürme işlemidir (Veri kaybı olmaz)

        //Narrowing Cast - Explicit Cast(Açık) Daha büyük veriyi daha küçük veriye dönüştürme işlemidir

        int bigIntNumber = 9999999; //Büyük veri
        byte byteNumber2 = (byte) bigIntNumber; //Veri kaybımız olur
        System.out.println(byteNumber2);
        System.out.println(intNumber);

        String cast4String = "10";
        int cast4Int = Integer.valueOf(cast4String);
        int cast4Int2 = Integer.parseInt(cast4String);

    }
}
