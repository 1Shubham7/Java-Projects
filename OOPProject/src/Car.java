public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerMake = make.toLowerCase();
        switch (lowerMake) {
            case "tesla", "bmw", "porsche" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void describeCar(){
        System.out.println(doors + " Doors " + color + " " + make + " " + model + " " + ( convertible ? "Convertible" : " ")) ;
    }
}
