package day02_Practise;

public class C06_StringManipulations {

    public static void main(String[] args) {

        // kullanicidan alcaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz

        String str = "hur dogdum hur yasarim sanane";

        if (str.contains(" ")){
            System.out.println("Evet bosluk var");
        }

        if (str.isBlank()){
            System.out.println("kelime bosluklardan olusuyor");
        }

        if (str.isEmpty()){
            System.out.println("sanirim yazmayi unuttunuz");
        }


    }
}
