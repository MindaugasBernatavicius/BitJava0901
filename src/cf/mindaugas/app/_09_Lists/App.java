package cf.mindaugas.app._09_Lists;

import java.util.*;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        // ArrayList<String> strings = new ArrayList<>();
        // strings.add("String1");
        // strings.add("String2");
        // System.out.println(strings);
        //
        // strings.add(1, "String3");
        // System.out.println(strings);
        //
        // strings.addAll(strings);
        // System.out.println(strings);
        //
        // System.out.println(strings.get(0));
        // System.out.println(strings.get(1));
        //
        // System.out.println(strings.contains(strings.get(1)));
        // System.out.println(strings.contains("String3"));
        // System.out.println(strings.contains(new String("String3")));
        //
        // System.out.println(strings.indexOf("StringN"));
        //
        // strings.clear();
        // System.out.println(strings);

        // naudojate ArrayList su custom klase
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(15, 1500));
        employees.add(new Employee(25, 800));
        employees.add(new Employee(15, 600));

        // // ciklą galime prasukti taip pat
        // for (int i = 0; i < employees.size(); i++) {
        //     System.out.println(employees.get(i));
        // }
        //
        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }

        // // sort
        // Collections.sort(employees); // Kolekcijoms
        // // Arrays.sort(employees); // Tik masyvams!
        employees.sort(Comparator.naturalOrder());
        // employees.sort(Comparator.reverseOrder());

        // // search
        // // ... search with simple objects
        // System.out.println(strings.contains("String3"));
        // System.out.println(strings.indexOf("StringN"));

        // ... search with custom objects
        // ... Collections.binarySearch(List<T implement Comparable>, T key);
        // ... ATMINKIME: binarySearch() Javoje reikalauja, kad arraylistas būtų surikiuotas iš anksto!
        System.out.println(employees);
        int result = Collections.binarySearch(employees, new Employee(15, 1500));
        System.out.println(result);


        ArrayList<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee(15, 300));
        employees2.add(new Employee(15, 600));
        employees2.add(new Employee(15, 600));
        employees2.add(new Employee(15, 600));
        employees2.add(new Employee(15, 800));

        System.out.println(employees2);
        int result2 = Collections.binarySearch(employees2, new Employee(15, 600));
        System.out.println(result2);

        // System.out.println(
        //         (new Employee(15, 600))
        //                 .equals(new Employee(15, 600)));

        System.out.println(employees2);
        // employees2.removeIf(employee -> employee.getSalary() >= 800);
        employees2.removeIf(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() >= 800;
            }
        });
        System.out.println(employees2);

        LinkedList<Employee> llEmployee = new LinkedList<>();
        llEmployee.add(new Employee(15, 600));

        Stack<Employee> stackOfEmpl = new Stack<>();
        stackOfEmpl.push(new Employee(15, 600));
        stackOfEmpl.push(new Employee(25, 6564));

        while(!stackOfEmpl.empty()) {
            System.out.println(stackOfEmpl.pop());
        }

    }
}

class Employee implements Comparable<Employee>{
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
        if (this == o) return true; // emp1.equals(emp1)
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

    @Override
    public int compareTo(Employee anotherEmployee) {
        return Integer.compare(this.salary, anotherEmployee.salary);
    }
}