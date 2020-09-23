package cf.mindaugas.app._05_interfaces;

public class App {
    public static void main(String[] args) {
        Bank bank1 = new Bank(1555262, 454, "Jiezno g. 5");
        bank1.print();

        CommercialBank cb1 = new CommercialBank(1555262, 454, "Jiezno g. 5");
        cb1.print();
    }
}

interface Printable {
    void print();
}

class Bank implements Printable, Comparable {
    int totalAmountOfMoney;
    int employeeCount;
    String address;

    public Bank(int totalAmountOfMoney, int employeeCount, String address) {
        this.totalAmountOfMoney = totalAmountOfMoney;
        this.employeeCount = employeeCount;
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println(
                "{ totalAmountOfMoney : " + totalAmountOfMoney
                + ", employeeCount: " + employeeCount + "}");
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class CommercialBank extends Bank {
    public CommercialBank(int totalAmountOfMoney, int employeeCount, String address) {
        super(totalAmountOfMoney, employeeCount, address);
    }
}