package day01_practise;

import java.util.Scanner;

public class C16_StringManipulationsMethods {

    public static void main(String[] args) {

        // kullanicidan isim ve soyisim alip
        // ismin basharfi buyut gerisi kucuk ayrica soyismin tamamini buyuk yazdiran bir method olusturun



        isimSoyisimDuzenleme();

    }

    public static void isimSoyisimDuzenleme (){

        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("soyismini giriniz");
        String soyIsim = scan.nextLine();

        String yenisim = isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
        String yeniSoyisim = soyIsim.toUpperCase();

        System.out.println(yenisim + " " + yeniSoyisim);




    }
}
