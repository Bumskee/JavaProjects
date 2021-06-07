public class Frigate extends Vehicle implements SeaVessel {
    public Frigate(String name, int maxPassengers, int maxSpeed, int displacement) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("launches");
    }
}
