package day02_Practise;

import java.util.Scanner;

public class C07_StringManipulations {

    public static void main(String[] args) {

        // kullanicinin bir kelime isteyin
        // ve verdigi kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Bir Kelime Giriniz");

        String word = scan.nextLine();

        String newword= "";

        for (int i = word.length()-1; i >=0 ; i--) {

            newword+=word.substring(i,i+1);
        }

        System.out.println(newword);
    }
}
