package day01_practise;

public class C11_NestedIf {

    public static void main(String[] args) {

        // oy kullanma skalasi
        // yas 18'den buyukse oy kullanabilir, kucukse kullanamaz
        // yas 50'den buyukse 2 oy kullanabilsin
        // yas 18 ile 50 arasi 1 oy kullanabilsin

        int yas = 49;

        if (yas>=50){
            System.out.println("2 Oya kullanabilirsiniz");
        } else if (yas>=18 && yas<=50) {
            System.out.println("1 oy kullanabilirsiniz");
        }else {
            System.out.println("oy kullanamazsiniz");
        }

        System.out.println("*****diger yontem*****");

        if (yas>=18){

            if (yas>=50){
                System.out.println("2 oy kullanabilirsiniz");
            }else {
                System.out.println("1 oy kullanabilrisiniz");
            }
        }else {
            System.out.println("oy kullnamazsiniz");
        }



    }
}
