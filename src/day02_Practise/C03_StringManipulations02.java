package day02_Practise;

import java.util.Scanner;

public class C03_StringManipulations02 {

    public static void main(String[] args) {

        // ONCEKI SORU HOCANIN COZUMU

        /*
       kullanicidan bir kelime girmesini isteyin.
       sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa.
       kelimenin ortasindaki karakteri yazdiriniz
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir kelime giriniz");

        String word = scan.next();

        if (word.length() >= 3 && word.length() % 2 == 0) {

            System.out.println(word.charAt((word.length()-1)/2));


        }else {
            System.out.println("istenen olcutlerde kelime giriniz");
        }
    }
}