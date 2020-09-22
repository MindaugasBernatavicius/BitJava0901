package cf.mindaugas.app._02_inheritenceandcomposition._03_compandinh;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(15, "Mindaugas");

        // 0. Primityviausias būdas išspausdinti objekto vidurius:
        System.out.println("Objekto viduriai: " + p1.getName() + " : " +  p1.getAge());

        // 1.
        System.out.println("Objekto viduriai: " + p1);

        // 2.
        Employee e1 = new Employee(12, "Petras", 1546);
        System.out.println("Objekto viduriai: " + e1);

        // 3.
        Janitor j1  = new Janitor(16, "Jonas", 4654, new Broom(55.99));
        System.out.println("Objekto viduriai: " + j1);
    }
}

class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{ name : " + name + ", age : " + age + " }";
    }
}

class Employee extends Person {
    private int badgeId;

    public Employee(int age, String name, int badgeId) {
        super(age, name);
        this.badgeId = badgeId;
    }

    public int getBadgeId() {
        return badgeId;
    }

    @Override
    public String toString() {
        return "{ badgeId : " + this.getBadgeId()
            + ", name : " + this.getName()
            + ", age : " + this.getAge() + " }";
    }
}

class Janitor extends Employee {
    private Broom broom;

    public Janitor(int age, String name, int badgeId, Broom broom) {
        super(age, name, badgeId);
        this.broom = broom;
    }

    public Broom getBroom() {
        return broom;
    }

    public void setBroom(Broom broom) {
        this.broom = broom;
    }

    @Override
    public String toString() {
        return "{ name : " + this.getName()
            + ", age: " + this.getAge()
            + ", badgeId : " + this.getBadgeId()
            + ", broom : " + this.broom + " }";
    }
}

class Broom {
    private double price;
    public Broom(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "{ price : " + price + "}";
    }
}