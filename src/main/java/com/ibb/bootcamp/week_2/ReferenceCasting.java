package com.ibb.bootcamp.week_2;

public class ReferenceCasting {
    public static void main(String[] args) {
        //Upcasting: Üst sınıfa dönüştürme işlemidir otomatik olarak implicit casting yapılır. Metotları sadece ilgili üst sınıfla sınırlıdır.
        Hayvan hayvan = new Kedi();
        hayvan.sesCikar();
//        hayvan.miyavla(); Üst sınıfa ait bit metot değildir.

        //Downcasting: Üst sınıf nesnesini alt sınıfa dönüştürme işlemidir. Explicit Cast (Manuel) gereklidir. Eğer nesne alt sınıftan türemediyse, Class Cast exception fırlatır.
        Hayvan hayvan2 = new Kedi(); // Upcasting
        Kedi kedi = (Kedi) hayvan2; // Downcasting (Manuel)
        kedi.miyavla(); // Artık Kedi'ye ait metotlara erişebiliriz

        //Downcasting yaparken aldığımızda yanlış tür dönüşüm hatasını güvenli şekilde yapabiliriz.
        if (hayvan2 instanceof Kedi) {
            Kedi kedi3 = (Kedi) hayvan;
            kedi3.miyavla();
        } else {
            System.out.println("Nesne Kedi türüne ait değil.");
        }
    }
}

class Hayvan {
    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kedi extends Hayvan {
    void miyavla() {
        System.out.println("Kedi miyavlıyor!");
    }
}