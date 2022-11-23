package day01_practise;

import java.util.Scanner;

public class C18_StringManipulations {

    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin, eger kelime uc veya uc'ten fazla harften olusuyorsa,
        // ilk iki harfi 3 kere yazdirin
        // diger durumda kelimeyi yazdirin

        // ornek:  ali >> alalal
        //         al >> al

        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim = scan.nextLine();

        if (isim.length()>=3){
            System.out.println(isim.substring(0,2));
            System.out.println(isim.substring(0,2));
            System.out.println(isim.substring(0,2));

        }else{
            System.out.println(isim);

        }


    }
}
