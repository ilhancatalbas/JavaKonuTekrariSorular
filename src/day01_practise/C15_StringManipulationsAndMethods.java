package day01_practise;

public class C15_StringManipulationsAndMethods {

    public static void main(String[] args) {

        // kullanicidan 2 isim ve soyisimini alan ve sonra bunlari birlestirip yazdiran bir method yapiniz

        String isim = "Ali";
        String soyisim = "Veli4950";

        birlestirYazdir(isim,soyisim);

        String isim2 = "Mustafa";
        String soyisim2 = "yigit";

        birlestirYazdir(isim2.toUpperCase(),soyisim2.toUpperCase());




    }

    public static void birlestirYazdir (String isim, String soyisim){

        String tamIsim = isim+ " " + soyisim;

        System.out.println(tamIsim);








    }
}
