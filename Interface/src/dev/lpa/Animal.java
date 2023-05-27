package dev.lpa;

enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStages(){
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1)% allStages.length];
    }

}


record DragonFly(String name, String type) implements FlightEnabled{
    @Override
    public void move() {

    }
    @Override
    public void takeOff() {

    }
    @Override
    public void land() {

    }
    @Override
    public void fly() {

    }
}


class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;

    public void achieveOrbit(){
        transition("Orbit Achieved");
    }

    @Override
    public void move() {

    }
    @Override
    public void takeOff() {
        transition("Taking OFF");
    }
    @Override
    public void land() {
        transition("Landing");
    }
    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while Orbiting");
    }

    public void transition (String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }

}

interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();
    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ":" + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage,"Beginning Transition to " + nextStage);
        return nextStage;
    }
}
 interface FlightEnabled{

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void move();
    void takeOff();
    void land();
    void fly();

/*
imagine we have a new requirement for FlightEnabled. a new method is needed called Transition
that uses FlightStages enum
*/

     default FlightStages transition(FlightStages stage){
//         System.out.println("transition not implemented on "+ this.getClass().getName());
//         return null;
         /*
         We write this negative thing to ensure that classes using this interface should
         override this method
         */

         FlightStages nextStage = stage.getNextStages();
         System.out.println("Trasitioning from " + stage + " to " + nextStage);
         return nextStage;
     }

/*
 unfortunately this due to this one change, all the classes that implements this interface
 won't compile until all of them are changed
*/

//The answer to this is extension method
}

interface Trackable {

    void track();
}
public abstract class Animal {

    public abstract void move();
}
