package day02_Practise;

public class C04_StringManipulations {

    public static void main(String[] args) {

        // soru :"   Java ogrenmek123 Cok guzel@      "
        //                                                   Stringini
        //       "Java ogrenmek cok guzel"  seklinde yazdiriniz

        String str = "   Java ogrenmek123 Cok guzel@      ";


        String word = str.trim().replaceAll("\\d","").replace("@","");

        System.out.println(word);

        System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());


    }
}
