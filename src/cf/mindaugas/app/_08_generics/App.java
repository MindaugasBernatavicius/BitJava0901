package cf.mindaugas.app._08_generics;

import cf.mindaugas.app._01_oopintro.Employee;

public class App {
    public static void main(String[] args) {
        System.out.println("---- 0. Using Pair class-----");
        Pair pairOfStrings = new Pair("Jonas", "Petras");
        System.out.println(pairOfStrings);

        System.out.println("---- 1. Using simple Pair w/ Object class-----");
        PairWObject pairOfObjects = new PairWObject(5, 6);
        System.out.println(pairOfObjects);
        PairWObject pairOfObjects2 = new PairWObject("Jonas", "Petras");
        System.out.println(pairOfObjects2);

        PairWObject pairOfObjects3 = new PairWObject("Jonas", 1);
        System.out.println(pairOfObjects3);

        System.out.println("---- 2. Using Pair w/ Generics -----");
        PairWGenerics<String, String> pairOfObjects4 = new PairWGenerics<>("Jonas", "Petras");
        PairWGenerics<Integer, Integer> pairOfObjects5 = new PairWGenerics<>(1, 3);
        PairWGenerics<Employee[], Employee[]> pairOfObjects6 = null;
        System.out.println(pairOfObjects4);

        System.out.println("---- 3. Using Pair w/ Generics w/ single type  -----");
        PairWGenSingleType<String> pairOfObjects7 = new PairWGenSingleType<>("s1", "S2");

        System.out.println("---- 4. Using nested pairs  -----");
        PairWGenerics<PairWGenSingleType<String>, PairWGenSingleType<String>> pairOfObjects8 = null;
    }
}

class Pair {
    private String first;
    private String second;

    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "{ first : " + first + ", second : " + second + " }";
    }
}

class PairWObject {
    private Object first;
    private Object second;

    public PairWObject(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "{ first : " + first + ", second : " + second + " }";
    }
}

class PairWGenerics<F, S> {
    private F first;
    private S second;

    public PairWGenerics(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "{ first : " + first + ", second : " + second + " }";
    }
}

class PairWGenSingleType<F> {
    private F first;
    private F second;

    public PairWGenSingleType(F first, F second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public F getSecond() {
        return second;
    }

    public void setSecond(F second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "{ first : " + first + ", second : " + second + " }";
    }
}
