package day01_practise;

import java.util.Scanner;

public class C06_KullanicidanDegerAlma {

    public static void main(String[] args) {


        //kullanicidan 2 sayi al toplamini yazdir

        Scanner scan = new Scanner(System.in);

        System.out.println("sayi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("1 sayi daha giriniz");
        int sayi2 = scan.nextInt();

        int toplam = sayi1+sayi2;

        System.out.println("girilen sayi toplam sonucu : " +toplam);


    }
}
