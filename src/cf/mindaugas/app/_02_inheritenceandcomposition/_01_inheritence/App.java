package cf.mindaugas.app._02_inheritenceandcomposition._01_inheritence;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Mindaugas");
        System.out.println(p1);

        Employee e1 = new Employee("Jonas", 1546);
        System.out.println(e1);

//        Teacher t1 = new Teacher();
//        t1.name = "Lupikas";
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Employee extends Person {
    private int badgeId;

    public Employee(String name, int badgeId) {
        super(name);
//        this.name = name;
        this.badgeId = badgeId;
    }

    @Override
    public String toString() {
        return "{" +
                "badgeId=" + badgeId
                 + super.toString() +
                "}";
    }
}

//class CEO extends Employee { }
//class Janitor extends Employee {}
//class Teacher extends Employee {}