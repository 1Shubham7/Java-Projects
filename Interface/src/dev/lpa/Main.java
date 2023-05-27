package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();

//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f kms or %.2f miles%n", kmsTraveled, milesTraveled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFlier(fliers);
        flyFliers(fliers);
        landFliers(fliers);

//        triggerFlier(betterFliers);
//        flyFliers(betterFliers);
//        landFliers(betterFliers);
//        This will show error as you can't pass a list to a method where an arraylist is asked/ declared

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFlier(ArrayList<FlightEnabled> fliers){
        for (var flier : fliers) {
            flier.takeOff();

        }
    }
    private static void flyFliers(ArrayList<FlightEnabled> fliers){
        for (var flier : fliers) {
            flier.fly();

        }
    }
    private static void landFliers(ArrayList<FlightEnabled> fliers){
        for (var flier : fliers) {
            flier.land();

        }
    }
}
