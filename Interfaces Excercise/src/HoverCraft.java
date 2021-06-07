public class HoverCraft extends Vehicle implements LandVehicle, SeaVessel {
    public HoverCraft(String name, int maxPassengers, int maxSpeed, int displacement, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
        this.numWheels = numWheels;
    }

    public void launch() {
        System.out.println("launches");
    }

    public void drive() {
        System.out.println("drives");
    }
}
