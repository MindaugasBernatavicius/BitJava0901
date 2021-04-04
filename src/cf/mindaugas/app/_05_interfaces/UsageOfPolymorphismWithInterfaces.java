package cf.mindaugas.app._05_interfaces;

import java.util.Arrays;

public class UsageOfPolymorphismWithInterfaces {

    static void sort(CustomComparable[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int kidx = 0; kidx < arr.length - 1 - k; kidx++) {
                if (!arr[kidx].compare(arr[kidx + 1])) {
                    CustomComparable temporary = arr[kidx + 1];
                    arr[kidx + 1] = arr[kidx];
                    arr[kidx] = temporary;
                }
            }
        }
    }

    static void sortv2(ComparebleByTwoProps[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int kidx = 0; kidx < arr.length - 1 - k; kidx++) {
                if (arr[kidx].compare(arr[kidx + 1]) == 1) {
                    ComparebleByTwoProps temporary = arr[kidx + 1];
                    arr[kidx + 1] = arr[kidx];
                    arr[kidx] = temporary;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Užduotis, su savo parašytu rikiavimo metodu išrikiuokite masyvą custom objektų
        Vehicle[] carPark = {
                new Vehicle(15261, 100),
                new Vehicle(545646, 150),
                new Vehicle(794, 200),
                new Vehicle(454515, 600),
                new Vehicle(454515, 300),
        };
        System.out.println("Before sorting: " + Arrays.toString(carPark));
        sortv2(carPark);
        System.out.println("After sorting: " + Arrays.toString(carPark));

        Cat[] cats = {
                new Cat(55),
                new Cat(12),
                new Cat(66)
        };
        System.out.println("Before sorting: " + Arrays.toString(cats));
        sort(cats);
        System.out.println("After sorting: " + Arrays.toString(cats));
    }
}

interface CustomComparable {
    boolean compare(CustomComparable o);
}

interface ComparebleByTwoProps {
    // -1 - kai nereikia apkeisti (pirmas mažesnis nei antras: pirmas.compare(antras))
    // 0 - kai vienodi
    // 1 - kai reikia apkeisti (pirmas didesnis nei antras: pirmas.compare(antras))
    int compare(ComparebleByTwoProps o);
}

class Vehicle implements ComparebleByTwoProps, CustomComparable {
    int price;
    int horsePower;

    public Vehicle(int price, int hp) {
        this.price = price;
        this.horsePower = hp;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{ price : " + price + ", hp : " + horsePower + " }";
    }

    @Override
    public boolean compare(CustomComparable v) {
        // car1.compare(car2)
        return this.price <= ((Vehicle) v).price;
        // return this.price > ((Vehicle)v).price;
    }

    @Override
    public int compare(ComparebleByTwoProps v) {
        if (this.price == ((Vehicle) v).price) {
            if (this.horsePower > ((Vehicle) v).horsePower) {
                return 1;
            } else if (this.horsePower < ((Vehicle) v).horsePower) {
                return -1;
            } else {
                return 0;
            }
        } else if (this.price > ((Vehicle) v).price) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Cat implements CustomComparable {
    int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{ age : " + age + " }";
    }

    @Override
    public boolean compare(CustomComparable c) {
        return this.age < ((Cat) c).age;
    }
}
