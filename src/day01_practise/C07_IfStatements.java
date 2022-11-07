package day01_practise;

import java.util.Scanner;

public class C07_IfStatements {

    public static void main(String[] args) {

        //kullanici y girdiginde Yes yazdirsin
        //kullanici n girdiginde NO yazdirsin

        Scanner scan = new Scanner(System.in);

        System.out.println("bir harf giriniz");

        String str = scan.next();

        if (str.equals("y")){
            System.out.println("yes");
        } else if (str.equals("n")) {
            System.out.println("no");

            // String de = olmaz equals metodu kullaniriz

        }


    }
}
