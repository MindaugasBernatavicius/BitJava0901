package cf.mindaugas.app;

public class HelloWorld {
    public static void main(String[] args) {

        // 0. Hw
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("-------------");

        // 1. Kintamieji
        // ... Deklaracija
        int i;

        // Deklaracija + inicializacija
        int j = 5;
        int z = 5;

        // Uniary operator (post-increment)
        j++; // j+=1 ;; j=j+1;

        // ... unary pre-increment operator
        System.out.println(++j);
        System.out.println(j++); // reikšmė pasikeičia po šitos eilutės

        // Binary operator
        int result = z + j;
        // System.out.print(result);

        // "+" overloaded operator
        System.out.println(5 + 6); // 11
        System.out.println("5" + "6"); // 56
        System.out.println("5" + 6); // 56
        System.out.println(5 + "6"); // 56

        // cast'ing
        double d = 5.9;
        int di = (int)d;
        System.out.println(di); // skaičius po kablelio yra numetamas

        float f1 = 5.9f;
        double d1 = f1; // priskirti galime be cast'o

        double d2 = 5.9;
        float f2 = (float)d2; // reikia castinti,nes duoble yra didesnis (rizika prarasti duomenis)

        // String
        String s1 = "\uD83E\uDDE0 \uD83E\uDDB7 \uD83E\uDDB4";
        System.out.println(s1);

        // ... equality
        String s2 = "ABC";
        String s3 = new String("ABC");
        System.out.println(s2 == s3); // netaisyklingas būdas
        System.out.println(s2.equals(s3));
        System.out.println(!
                (s2.equals(s3) // true ==> !true == false
            ));

        // ... int equality
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 == i2);

        // ...
        System.out.println("-------------");
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".endsWith("BC"));
        System.out.println("ABC".endsWith("bc"));
        System.out.println("ABC".toLowerCase());
        System.out.println("ABC".toLowerCase().endsWith("bc"));
        System.out.println("ABC".length());
        System.out.println("ABC".replace("A","Z"));
        System.out.println("ABC".replace('A', 'Z'));
        //
    }
}