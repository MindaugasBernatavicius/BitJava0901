package cf.mindaugas.app._08_generics;

import java.util.Arrays;

public class ComparatorsWGenerics {
    public static void main(String[] args) {
        Employee[] bitEmployees = {
                new Employee(22, 800),
                new Employee(30, 1000),
                new Employee(19, 700),
                new Employee(29, 1200)
        };

        System.out.println("Before sorting: " + Arrays.toString(bitEmployees));
        Arrays.sort(bitEmployees);
        System.out.println("After sorting: " + Arrays.toString(bitEmployees));

        //
        Employee employee1 = new Employee(29, 1200);
        Employee employee2 = new Employee(30, 1300);
        System.out.println(employee1.compareTo(employee2));
        // w/o generics we can call compareTo w/ any type
        // ... java.lang.ClassCastException
        // ... if you have specified the type with generics
        // ... you are prohibited to use arbitrary types
        // ... java: incompatible types: java.lang.String
        // System.out.println(employee1.compareTo("employee2"));

        // 3. Levels of errors (sorted by amount danger):
        // ... 1. Compile time
        // ... 2. Runtime errors
        // ... 3. No errors, but logic is incorrect
    }
}

class Employee implements Comparable<Employee> {
    private int age;
    private int salary;

    public Employee(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{ age : " + age + ", salary : " + salary + " }";
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        return Integer.compare(this.salary, anotherEmployee.salary);
    }
}