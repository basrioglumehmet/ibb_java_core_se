package com.ibb.bootcamp.week_2.java_8_features;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface DatabaseRepository {
    void save(String data, List<String> database);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Tek bir liste kullanılıyor
        List<String> database = new ArrayList<>();

        // Lambda fonksiyonu, verilen listeye veri ekler
        DatabaseRepository saveLambda = (data, db) -> {
            db.add(data);
            System.out.println("Lambda ile veri eklendi: " + data);
        };

        // Lambda ile veri ekleme
        saveLambda.save("Kullanıcı 1", database);
        saveLambda.save("Kullanıcı 2", database);

        // Sonuçları göster
        System.out.println("Veritabanındaki tüm veriler: " + database);
    }
}
