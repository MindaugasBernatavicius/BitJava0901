package cf.mindaugas.app._07_comparableandcomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Employee[] bitEmployees = {
                new Employee(22, 800),
                new Employee(30, 1000),
                new Employee(19, 700),
                new Employee(29, 1200)
        };
       // System.out.println("Before sorting: " + Arrays.toString(bitEmployees));
       // Arrays.sort(bitEmployees);
       // System.out.println("After sorting: " + Arrays.toString(bitEmployees));

       System.out.println("-----------------------------------------------");

        // System.out.println("Before sorting: " + Arrays.toString(bitEmployees));
        // Arrays.sort(bitEmployees, new EmployeeReverseComparator());
        // System.out.println("After sorting: " + Arrays.toString(bitEmployees));

       System.out.println("-----------------------------------------------");

        // System.out.println("Before sorting: " + Arrays.toString(bitEmployees));
        // Arrays.sort(bitEmployees, Collections.reverseOrder());
        // System.out.println("After sorting: " + Arrays.toString(bitEmployees));

        System.out.println("======= Comparator with anonymous class =======");
        System.out.println("Before sorting: " + Arrays.toString(bitEmployees));
        // Arrays.sort(bitEmployees, new EmployeeReverseComparator());
        Arrays.sort(bitEmployees, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return -1 * Integer.compare(((Employee)o1).getSalary(), ((Employee)o2).getSalary());
            }
        });
        System.out.println("After sorting: " + Arrays.toString(bitEmployees));

    }
}

class Employee implements Comparable {
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
        return "{ age : " + age +
                ", salary : " + salary +
                " }";
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.salary, ((Employee)o).salary);
    }
}

class EmployeeReverseComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return -1 * Integer.compare(((Employee)o1).getSalary(), ((Employee)o2).getSalary());
    }
}