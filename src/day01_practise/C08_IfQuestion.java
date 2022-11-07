package day01_practise;

public class C08_IfQuestion {

    public static void main(String[] args) {

        /* bot hesplayici
           85-100 arasi A
           70-84  arasi B
           50-59  arasi c
           35-49  arasi D
           0-34   arasi E
       */

        int not = 50;

        if (not>=85){
            System.out.println("A");

        } else if (not>=70) {
            System.out.println("B");

        } else if (not>=50) {
            System.out.println("C");

        } else if (not>=35) {
            System.out.println("D");

        } else if (not>=0) {

            System.out.println("E");

        }

    }
}
