package day02_Practise;

import java.util.Scanner;

public class C03_StringManipulations {

    // BENIM COZUMUM

    /*
       kullanicidan bir kelime girmesini isteyin.
       sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa.
       kelimenin ortasindaki karakteri yazdiriniz
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir kelime giriniz");

        String word = scan.next();

        if (word.length()>=3 && word.length()%2==0){

            System.out.println(word.substring(word.length()/2-1,word.length()/2));
        }else{
            System.out.println("istenen olcutlerde kelime giriniz");
        }

    }
}
