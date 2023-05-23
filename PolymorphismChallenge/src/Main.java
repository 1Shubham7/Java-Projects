public class Main {
    public static void main(String[] args) {
        Car car = new Car("Good");
        HybridCar b = new HybridCar("asd",12.2,12,2);
        car.drive();
        car.runEngine();
        car.startEngine();
        b.drive();
        b.runEngine();
    }
}