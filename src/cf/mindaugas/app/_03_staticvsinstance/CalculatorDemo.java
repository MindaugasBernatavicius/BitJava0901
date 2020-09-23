package cf.mindaugas.app._03_staticvsinstance;

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println(StaticCalculator.add(4, 5));
        // System.out.println((new NonstaticCalculator()).add(8, 9));
        NonstaticCalculator nsc = new NonstaticCalculator();
        System.out.println(nsc.add(8, 9));
    }
}

class StaticCalculator {
    public static int add(int i, int j){
        return i + j;
    }
}
class NonstaticCalculator {
    public int add(int i, int j){
        return i + j;
    }
}