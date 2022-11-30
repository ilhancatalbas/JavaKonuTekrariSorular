package day02_Practise;

import java.util.Scanner;

public class C05_StringManipulations {

    public static void main(String[] args) {

        // kullanicidan isim ve soyismini girmesini isteyiniz ve hangisinin daha uzun oldugunu yazdiriniz.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Adinizi Giriniz");

        String name = scan.nextLine();

        System.out.println("Lutfen Soyadinizi Giriniz");

        String surname = scan.nextLine();

        if (name.length()>surname.length()){
            System.out.println("isminiz daha uzun = " + name);
        }

        else if (name.length()<surname.length()) {
            System.out.println("Soyisminiz daha uzun = " + surname);

        }
        else {
            System.out.println("Ayni uzunluktalar = " + name + " " + surname);
        }







    }
}
