package cf.mindaugas.app._10_sets;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {

        ArrayList<Employee> eAl = new ArrayList<>();
        eAl.add(new Employee(15, 300));
        eAl.add(new Employee(15, 600));
        eAl.add(new Employee(15, 600));
        eAl.add(new Employee(15, 600));
        eAl.add(new Employee(15, 800));
        System.out.println(eAl);

        // Išrenkame dublikatus
        HashSet<Employee> eSet = new HashSet<>();
        eSet.addAll(eAl);
        System.out.println(eSet);

        // TreeSet
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("CCC");
        tSet.add("BBB");
        tSet.add("AAA");
        System.out.println(tSet);

        Iterator<String> iterator = tSet.iterator();
        System.out.print("TreeSet: ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");
        System.out.println();

        System.out.println(tSet);
    }
}


class Employee {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        return salary == employee.salary;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "{ age : " + age + ", salary : " + salary + " }";
    }
}