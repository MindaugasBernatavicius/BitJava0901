package cf.mindaugas.app.oopintro;

public class Employee {
    // fieldai, laukai, savybės
    String name;
    String surname;
    private int age;

    // ... overloaded konstruktorius
    // ... be parametrų
    public Employee(){}

    // ... parametrizuotas konstruktorius
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setAge(int age){
        if(age <= 0 || age > 125){
            System.out.println("Please provide valid age!");
        } else {
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "{ name: " + name + ", surname: " + surname + ", age: " + age + "}";
    }
}