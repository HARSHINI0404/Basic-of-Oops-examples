package Inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        System.out.println("---Vehicle class---");
        Vehicle v1=new Vehicle();
        v1.start();
        v1.stop();
        v1.fuel();

        System.out.println("---Air Vehicle class---");
        AirVehicle air=new AirVehicle();
        air.start();
        air.stop();
        air.fuel();
        air.TravelOnAir();

        System.out.println("---Water Vehicle class---");
        WaterVehicle w1=new WaterVehicle();
        w1.start();
        w1.stop();
        w1.fuel();
        w1.TravelOnWater();

        System.out.println("---Road Vehicle class---");
        RoadVehicle r1=new RoadVehicle();
        r1.start();
        r1.stop();
        r1.fuel();
        r1.TravelOnRoad();
    }
}
