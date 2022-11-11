package day01_practise;

import java.util.Scanner;

public class Team11_Soru01 {

    public static void main(String[] args) {

        // Hayat spor salonu için kullanıcıdan
        // isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        // bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.

        Scanner scanner = new Scanner(System.in);



        System.out.println("isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyIsim = scanner.nextLine();
        System.out.println("yasinizi giriniz");
        scanner.next();
        int yas = scanner.nextInt();
        System.out.println("kilonuzu giriniz");
        int kilo = scanner.nextInt();
        System.out.println("boyunuzu giriniz");
        int boy = scanner.nextInt();
        System.out.println("kac ay katilacaginiz giriniz");
        int aySuresi = scanner.nextInt();

        System.out.println("odenmesi gereken toplam ucret :" + (aySuresi*20));


    }
}
