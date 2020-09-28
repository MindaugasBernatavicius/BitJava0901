package cf.mindaugas.app._09_Lists;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("String1");
        strings.add("String2");
        System.out.println(strings);

        strings.add(1, "String3");
        System.out.println(strings);

        strings.addAll(strings);
        System.out.println(strings);

        System.out.println(strings.get(0));
        System.out.println(strings.get(1));

        System.out.println(strings.contains(strings.get(1)));
        System.out.println(strings.contains("String3"));
        System.out.println(strings.contains(new String("String3")));

        System.out.println(strings.indexOf("StringN"));

        strings.clear();
        System.out.println(strings);
    }
}
