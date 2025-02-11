package com.ibb.bootcamp.week_1;

public class Variables {
    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;
        /*


            1-) isim, veya sıfat, zamir kullanmamız lazım.
            2-) _ veya $ ile başlayabilirsiniz
            3-) sayı ile bitebilir.
            4-) Sayı ile başlanmaz
            5-) _veya$ dışında özel simgelerle başlanmaz
            6-) değişken isimlerini camelCase kuralına göre yazılır
         */

        // veri isimlendirmeleri;
        int schoolNumber = 23;
        System.out.println(schoolNumber);

        schoolNumber=44;
        System.out.println(schoolNumber);

        int _schoolNumber=55;
        System.out.println( _schoolNumber);

        int $schoolNumber=99;
        System.out.println( $schoolNumber);

        int schoolNumber123=105;
        System.out.println( schoolNumber123);

        //int schoolNumber=11; // aynı isimde yazamazsınız
        //int 44schoolNumber=11; // sayıyla başlayamazsınız.
        //int ~schoolNumber=11;   // özel simgeyle başlayamazsınız.
        //int ``schoolNumber=11;   // özel simgeyle başlayamazsınız.
    }
}
