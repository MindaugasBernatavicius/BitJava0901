package cf.mindaugas.app._02_inheritenceandcomposition._02_composition;

public class App {
    public static void main(String[] args) {
        Engine engine1 = new Engine(900, 12, "Diesel");
        // Dependency injection: constructor injection
        Car car1 = new Car(engine1);
        System.out.println(car1);

        Car car2 = new Car();
        // Dependency injection: setter injection
        car2.setEngine(new Engine(100, 4, "Gasoline"));
        System.out.println(car2);
    }
}

class Engine {
    private int horsePower;
    private int cylinderCount;
    private String fuelType;

    public Engine(int horsePower, int cylinderCount, String fuelType) {
        this.horsePower = horsePower;
        this.cylinderCount = cylinderCount;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", cylinderCount=" + cylinderCount +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}

class Car {
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "{" + engine + '}';
    }
}