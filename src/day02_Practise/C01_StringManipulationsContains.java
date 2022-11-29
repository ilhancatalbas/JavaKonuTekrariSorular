package day02_Practise;

public class C01_StringManipulationsContains {

/*
       girilen String icinde "xyz" dizini var ise true
       yok ise false return eden method yaziniz.
       ornek:

       input      output
       oxyzn  ==  true
       xyz    ==  true
       x.yz   ==  false
       xyoz   ==  false
*/

    public static void main(String[] args) {

        String word = "oxyzn";

        if (word.contains("xyz")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }


}
