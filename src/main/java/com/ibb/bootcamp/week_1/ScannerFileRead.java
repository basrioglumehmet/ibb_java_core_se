package com.ibb.bootcamp.week_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C://Users//basri//OneDrive//Desktop//IBB Java//ibb_java_core_se//String_Pool.md");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){ //Eğer scannerda veri varsa devam et
            String data = scanner.nextLine(); //Veriyi oku
            System.out.println(data);
        }
        scanner.close(); //Dikkat! File işlemi ile scanner kapatılmazsa bellek taşma sorunlarına sebep olmaktadır!

    }
}
