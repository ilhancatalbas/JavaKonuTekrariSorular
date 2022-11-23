package day01_practise;

import java.util.Scanner;

public class C19_StringManipulations {

    public static void main(String[] args) {

        /*
          Kullanicidan 4 kelime isteyin
          cumle duzenine gore yazdirin.
          ilk kelimenin ilk harfi buyuk digerleri kucuk. sonda nokta

          ornek: Cumle duzeni bu sekilde.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci kelimeyi giriniz");
        String word1= scan.next();

        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String word2= scan.next();

        System.out.println("Lutfen ucuncu kelimeyi giriniz");
        String word3= scan.next();

        System.out.println("Lutfen dorduncu kelimeyi giriniz");
        String word4= scan.next();

        System.out.println(word1.substring(0,1).toUpperCase()+
                word1.substring(1).toLowerCase() + " " +
                word2.toLowerCase() + " " +
                word3.toLowerCase() + " " +
                word4.toLowerCase() + ".");


    }
}
