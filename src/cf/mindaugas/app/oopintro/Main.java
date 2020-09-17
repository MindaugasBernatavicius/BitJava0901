package cf.mindaugas.app.oopintro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tipas objektoPavadinimas = new Konstruktorius();
        Employee employee1 = new Employee();
        employee1.name = "Mindaugas";
        employee1.surname = "Jonaitis";

        Employee employee2 = new Employee();
        employee2.name = "Petras";
        employee2.surname = "Peraitis";

        Employee employee3 = new Employee();
        employee3.name = "Juozas";
        employee3.surname = "Juozaitis";

        Employee employee4 = new Employee("Tomas", "Tomaitis");
        employee4.setAge(150);

        Employee employee5 = new Employee("Kęstas", "Kęstaitis");
        employee5.setAge(150);

        System.out.println("Darbuotojo vardas: " + employee1.name + ", pavardė " + employee1.surname);
        System.out.println("Darbuotojo vardas: " + employee2.name);
        System.out.println("Darbuotojo vardas: " + employee3.name);
        System.out.println("Darbuotojo vardas: " + employee4.name
                                    + ", pavardė " + employee4.surname
                                    + ", amžius " + employee4.getAge());


        // Objektų masyvai
        Employee[] employees = new Employee[2];
        employees[0] = employee4;
        employees[1] = new Employee("Mr.", "T");

        Employee[] employees2 = {
                employee5,
                employee4,
                new Employee("Jack", "Daniels")
        };

        System.out.println("Employees array contains: " + Arrays.toString(employees));
        System.out.println("Employees array contains: " + Arrays.toString(employees2));
    }
}