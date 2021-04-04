package cf.mindaugas.app._08_generics;

import cf.mindaugas.app._01_oopintro.Employee;

import java.util.Arrays;

public class DynamicArrayExample {
    public static void main(String[] args) {
        DynamicArray<String> dArr = new DynamicArray<>(2);
        dArr.add("String1");
        dArr.add("String2");
        dArr.add("String3");
        dArr.add("String4");

        // for (int i = 0; i < 1000; i++) {
        //     dArr.add("String" + i);
        // }
        // System.out.println(dArr);

        DynamicArray<Employee> employees = new DynamicArray<>();
        for (int i = 0; i < 1000; i++) {
            employees.add(new Employee("Mindaugas" + i, "B" + i));
        }
        System.out.println(employees);
    }
}

class DynamicArray<T> {
    T[] arr;
    int counter = 0;

    // init
    public DynamicArray(int initialCount) {
        this.arr = (T[]) new Object[initialCount];
    }

    public DynamicArray() {
        this.arr = (T[]) new Object[1];
    }

    // add
    public void add(T item) {
        if (counter == this.arr.length) {
            T[] tmp = this.arr;
            this.arr = (T[]) new Object[counter + 1];
            for (int i = 0; i < tmp.length; i++) {
                this.arr[i] = tmp[i];
            }
        }
        this.arr[counter] = item;
        counter++;
    }

    // addMany(T[] items)

    // remove

    // sort (could be)

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}