public class PoliceCar extends Vehicle implements LandVehicle, IsEmergency {
    private boolean onShift;

    public PoliceCar(String name, int maxPassengers, int maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
        onShift = false;
    }

    public void drive() {
        System.out.println("drives");
    }

    public void soundSiren() {
        System.out.println("*Siren Sounds*");
    }

    public void inspect(Vehicle vehicle) {
        if (onShift) {
            System.out.println("The vehicle's name is " + vehicle.name);
            System.out.println("The vehicle's max passenger is " + vehicle.maxPassengers);
            System.out.println("The vehicle's max speed is " + vehicle.maxSpeed);
            if (vehicle instanceof LandVehicle) {System.out.println("The vehicle's number of wheels is " + vehicle.numWheels);}
            if (vehicle instanceof SeaVessel) {System.out.println("The vehicle's number of displacements is " + vehicle.displacement);}
        } else {
            System.out.println("Currently not on shift.");
        }
    }

    public void changeShift() {
        onShift = !onShift;
    }
}
