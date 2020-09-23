package cf.mindaugas.app._03_staticvsinstance;

public class App {
    public static void main(String[] args) {
        // 0. Initialize static variable
        Person.age = 15;

        // 1. Accessing static variable
        System.out.println(Person.age);

        // 2. Changing static variable
        Person.age = 55;
        System.out.println(Person.age);

        // 3. Can we reach static field from object
        Person p1 = new Person();
        p1.age = 88;
        System.out.println(Person.age);

        // 4. Multiple objects see the same
        Person p2 = new Person();
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());

        p2.setAge(99);

        // .. will both lines print the same?
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }
}

class Person {
    static int age;

    String name;
    static void method(){
        // name; // Non-static field 'name' cannot be referenced from a static context
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
