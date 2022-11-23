package day01_practise;

import java.util.Scanner;

public class C20_StringManipulations {

    public static void main(String[] args) {

        // BENIM COZUMUM.

        // HOCANIN COZUMU BIR SONRAKI CLASS'DA

        /*
          kullanicidan bir kelime alin, ilk iki harfini silin
          ilk harf "g" ise g'yi silmeyin
          ikinci harf "h" ise "h" yi silmeyin

          input    output
          goat     gat
          photo    hoto
          ghost    ghost
          kalem    lem
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String word= scan.next();

        if (word.startsWith("g")){
            System.out.println(word.substring(0,1) + word.substring(2));
        } else if (word.substring(1,2).startsWith("h")) {
            System.out.println(word.substring(1));

        } else {
            System.out.println(word.substring(2));

        }
    }
}
