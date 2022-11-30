package day02_Practise;

import java.util.Scanner;

public class C08_StringManipulations {

    public static void main(String[] args) {

        // basit 4 islem yapan bir hesap makinesi kodlayiniz
        // kullanicidan yapacagi islemi islem sembolu ile secmesini saglayiniz
        // kullanicidan 2 sayi girmesini isteyiniz
        // girilen 2 sayi ve secilen isleme gore dogru sonucu ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir islem seciniz?  +-*/");

        char ch = scan.next().charAt(0);

        System.out.println("Birinci sayi");

        int num1 = scan.nextInt();

        System.out.println("Ikinci sayi");

        int num2 = scan.nextInt();

        switch (ch){
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '/':
                System.out.println(num1/num2);
                break;

            default:
                System.out.println("uygun isareti giriniz");

        }


    }
}
