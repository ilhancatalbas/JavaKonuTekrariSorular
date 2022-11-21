package day01_practise;

public class C17_StringManipulations {

    public static void main(String[] args) {

        /*
           Asagidaki degerleri toplayabilen bir program yapiniz

           12.34$
           32.23$

         */

        String fiyat1 = "12.34$";
        String fiyat2 = "32.23$";

        String duzeltilmisFiyat1 = fiyat1.replaceAll("\\D","");
        String duzeltilmisFiyat2 = fiyat2.replaceAll("\\D","");

        String toplam = duzeltilmisFiyat1+duzeltilmisFiyat2;

        System.out.println("Sonuc : " + toplam);

        double sayi1 = Double.parseDouble(duzeltilmisFiyat1)/100;
        double sayi2 = Double.parseDouble(duzeltilmisFiyat2)/100;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        double toplamDeger = sayi1+sayi2;

        System.out.println("sayi1+sayi2 = " + toplamDeger);

    }
}
