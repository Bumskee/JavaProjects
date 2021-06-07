public class Jeep extends Vehicle implements LandVehicle {

    public Jeep(String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("drives");
    }
}
