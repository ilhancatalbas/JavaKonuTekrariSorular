package day01_practise;

import java.util.Scanner;

public class C14_StringManipulations {

    public static void main(String[] args) {

        // kullanicidan ismini ve soyismini sorun ve
        // butun ismini ve soyismini buyuk harf ile yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("isim ve soyisminizi giriniz");

        String isimSoyisim= scan.nextLine();


        System.out.println("adiniz ve soyadiniz : " + isimSoyisim.toUpperCase());



    }

}
