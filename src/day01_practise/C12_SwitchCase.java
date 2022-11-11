package day01_practise;

public class C12_SwitchCase {

    public static void main(String[] args) {

        // ders programi:

        // pazartesi, sali : Java dersi
        // persembe, cuma : Selenium
        // carsamaba cumartesi : SQL dersi
        // diger gunler : izin gunu


        String gun = "carsamba";

        switch (gun){

            case "pazartesi":
                System.out.println("Java dersi");
                break;

            case "sali":
                System.out.println("Java dersi");
                break;

            case "carsamba":
                System.out.println("SQL dersi");
                break;

            case "persembe":
                System.out.println("Selenium");
                break;

            case "cuma":
                System.out.println("Selenium dersi");
                break;

            default:
                System.out.println("izin gunu");

        }

    }
}
