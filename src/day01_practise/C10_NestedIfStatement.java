package day01_practise;

public class C10_NestedIfStatement {

    public static void main(String[] args) {

        /* mantik su
               1 sart kostuk 18 yasindan buyuk ise iceri gelsin

               sonra bu sart saglandiktan sonra bir sart daha kostuk
               bayansa soyle olsun ve erkekse boyle olsun
               */


        // hayvan mekani >< 15 yas ustu girebilir, kedi sevenler saga, kopek sevenler sola gitsin

        int yas=16;
        String sevdigiHayvan = "kedi";

        if (yas>15){
            System.out.println("iceri girebilirsiniz");
            if (sevdigiHayvan.equals("kedi")){
                System.out.println("kedi icin saga gidiniz");
            } else if (sevdigiHayvan.equals("kopek")) {
                System.out.println("kopek icin sola gidiniz");

            }
        }else {
            System.out.println("iceri giremez");
        }






    }





}
