package Inheritance;

public class AirVehicle extends Vehicle {
    public void TravelOnAir() {
        super.color="Green";
        System.out.println("Air Vehicle");
        System.out.println("color="+super.color);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Air Vehicle Started");
    }
    @Override
    public void stop() {
        System.out.println("Air Vehicle Stopped");
    }
    @Override
    public void fuel() {
        System.out.println("Air Vehicle Fueled");
    }
}
