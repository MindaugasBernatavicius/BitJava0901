package cf.mindaugas.app.oopintro;

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
    }
}

class Employee {
    public void setAge(int age){
        if(age <= 0 || age > 125){
            System.out.println("Please provide valid age!");
        } else {
            this.age = age;
        }
    }


    // fieldai, laukai, savybės
    String name;
    String surname;
    private int age;

    // ... overloaded konstruktorius
    // ... be parametrų
    public Employee(){}

    // ... parametrizuotas konstruktorius
    public Employee(String n, String s) {
        this.name = n;
        this.surname = s;
    }

    public int getAge(){
        return this.age;
    }


}