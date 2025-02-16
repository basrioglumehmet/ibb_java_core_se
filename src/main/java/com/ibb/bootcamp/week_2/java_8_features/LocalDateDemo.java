package com.ibb.bootcamp.week_2.java_8_features;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now(); // Bugünün tarihi
        System.out.println("Bugünün Tarihi: " + bugun);

        LocalDate ozelTarih = LocalDate.of(2025, 2, 12); // Özel bir tarih
        System.out.println("Özel Tarih: " + ozelTarih);
    }
}
