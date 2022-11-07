package day01_practise;

public class C09_Ternary {

    public static void main(String[] args) {

        // urun 50 tl altisa "ucuz" yazsin
        // urun 50 tl ustuyse "pahali" yazsin

        //  () ? () : () :

        // soru isaretinden sonraki kisim dogruysa. degilse diger kisim yanlisa

        int urunFiyati =51;

        System.out.println((urunFiyati>50) ? ("pahali") : ("ucuz") );

        // fiyat 10'dan az ise ucuz olsun. 10 ile 20 arasi ise normal, 20 den fazla ise pahali olsun


        int urunFiyat2 = 9;

        System.out.println((urunFiyat2 < 10) ? ("ucuz") : ((urunFiyat2 < 20) ? ("normal") : ("pahali")));

        // mantik su:



    }
}
