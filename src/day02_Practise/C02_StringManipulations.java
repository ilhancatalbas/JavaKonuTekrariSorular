package day02_Practise;

public class C02_StringManipulations {

/*
       name1 ve name 2 degiskenlerini olusturun
       name1 degiskenin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
       name1 degiskeninin karakter sayisi tek ise
       "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
       yazdiriniz
*/

    public static void main(String[] args) {

        String name1 = "mehme";

        String name2 = "ihsan";

        String name1Uzunluk = "";

        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2) + name2 + name1.substring(name1.length()/2));



        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }


    }


}
