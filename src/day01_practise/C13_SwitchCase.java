package day01_practise;

import java.util.Scanner;

public class C13_SwitchCase {

    public static void main(String[] args) {

        // kullanicidan bir hard alin ve harfa gore
        // A girerse java cok kolay
        // B girerse java cok eglenceli
        // C girerse javayi cok seviyorum

        Scanner scan  = new Scanner(System.in);

        System.out.println("lutfen bir harf giriniz");

        char harf = scan.next().charAt(0);

        switch (harf){

            case 'A':
            case 'a':
                System.out.println("java cok kolay");
                break;

            case 'B':
            case 'b':
                System.out.println("java cok eglenceli");
                break;

            case 'C':
                System.out.println("javayi cok seviyorum");
                break;

            default:
                System.out.println("A, B veya C harflerinden, bir harf giriniz");
        }


    }
}
