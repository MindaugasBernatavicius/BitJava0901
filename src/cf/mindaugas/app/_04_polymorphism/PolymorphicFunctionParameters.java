package cf.mindaugas.app._04_polymorphism;

public class PolymorphicFunctionParameters {
    static void doSomethingWithPersonx(PersonX p){
        p.doSomething();
    }

    public static void main(String[] args) {
        doSomethingWithPersonx(new PersonX());
        doSomethingWithPersonx(new EmployeeX());
    }
}

class PersonX {
    public void doSomething(){}
}
class EmployeeX extends PersonX { }
