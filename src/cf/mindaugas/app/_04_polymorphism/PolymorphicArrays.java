package cf.mindaugas.app._04_polymorphism;

public class PolymorphicArrays {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person();
        people[1] = new Employee(); // polymorphism

        for (int i = 0; i < people.length; i++) {
            people[i].doSomething();
        }
    }
}
class Person {
    public void doSomething(){}
}
class Employee extends Person { }