package cf.mindaugas.app._12_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        // 0. Declaration
        HashMap<String, String> empMap = new HashMap<>();

        // 1. Adding kv pairs
        empMap.put("Jonas", "+3556583861");
        empMap.put(null, null);
        empMap.put("Petras", "+355849461");
        empMap.put(null, null);
        empMap.put("Juozas", "AAA");
        empMap.put("Juozas", null);


        // 2. Looping over map
        System.out.println(empMap.entrySet());

        for (Map.Entry<String, String> entry : empMap.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());

        // 3. Get value by key (search)
        System.out.println(empMap.get("Jonas"));

        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("Jonas", "+3556583861");
        // tm.put(null, null); // NullPointerException
        tm.put("Petras", "+355849461");
        // tm.put(null, null);
        tm.put("Juozas", "AAA");
        tm.put("Juozas", null);

        System.out.println("Tm: " + tm);

        Set<Map.Entry<String, String>> entrySet = tm.entrySet();
        System.out.println("Es: " + entrySet);
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            // entrySet.remove(entry); // ConcurrentModificationException due to internal iterator
        }

        System.out.println("Es: " + entrySet);
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
