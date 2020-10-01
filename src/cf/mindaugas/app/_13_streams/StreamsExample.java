package cf.mindaugas.app._13_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<>();
        arrL.add("Jonas");
        arrL.add("Petras");
        arrL.add("Juozas");
        arrL.add("Max");

        Optional<String> minimum = arrL.stream()
                .min((o1, o2) -> o1.length() > o2.length() ? 1 : 0);

        System.out.println(minimum.get());

        // Map - iškviečia funkciją, kiekvienam kolekcijos nariui
        List<String> namesList = arrL.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(namesList);

        // Filter
        List<String> namesLongerThan5 = arrL
                .stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(namesLongerThan5);

        // Reduce
        int lenghtOfAllNames = arrL.stream()
                .map(s -> s.length())
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println(lenghtOfAllNames);

        System.out.println("Average name lenght: " + arrL.stream().mapToInt(String::length).average().getAsDouble());
        System.out.println("Total name lenght: " + arrL.stream().mapToInt(String::length).sum());
    }
}
