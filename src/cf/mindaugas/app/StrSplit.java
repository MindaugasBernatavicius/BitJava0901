package cf.mindaugas.app;

import java.util.Arrays;

public class StrSplit {
    public static void main(String[] args) {
        String str = "{ name: Festuca-glauca, exposure: sun, height: 15, price: 2.55 }";
        System.out.println(Arrays.toString(str.split("(:\\s)|(,\\s)|(\\{\\s)|(\\s})")));
    }
}
