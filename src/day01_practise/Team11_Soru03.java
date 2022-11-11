package day01_practise;

import java.util.Scanner;

public class Team11_Soru03 {

    public static void main(String[] args) {

       /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak,
        işin bitme süresini hesaplayan kodu yazınız.

        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir?
        10 Toplam kaç işçi çalışacak?
        2 İşin bitme süresi 5 gündür.
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iscinin isi bitirme gun suresini giriniz");

        int isciGunSayisi = scan.nextInt();

        System.out.println("kac isci calisacaktir");

        int isciSayisi = scan.nextInt();

        double isinBitmeSuresi=isciGunSayisi/isciSayisi;

        System.out.println("isin bitme suresi : " + isinBitmeSuresi);





    }
}
