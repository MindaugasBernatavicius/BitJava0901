package cf.mindaugas.app._06_abstractclass;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(55);
        Square square = new Square(55);

        System.out.println(circle.getArea());
        System.out.println(square.getArea());
    }
}

abstract class Shape {
    protected int length;
    public Shape(int length) {
        this.length = length;
    }
    abstract double getArea();
}

class Square extends Shape {
    public Square(int length) {
        super(length);
    }
    @Override
    double getArea() {
        return this.length * this.length;
    }
}

class Circle extends Shape {
    public Circle(int length) {
        super(length);
    }
    @Override
    double getArea() {
        return Math.PI * (this.length / 2) * (this.length / 2);
    }
}
