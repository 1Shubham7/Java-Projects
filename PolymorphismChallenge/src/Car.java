public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    void startEngine() {
        System.out.println("BROOOMMMMMM!");
    }

    void drive() {
        System.out.println("BRUUUUUUUU!");
    }

    protected  void runEngine() {
        System.out.println("CROOOOOOOOO!");
    }
}

//Now Components

class ElectricCar extends Car{
    private double avgKmPerCharge ;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}

class HybridCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }
}