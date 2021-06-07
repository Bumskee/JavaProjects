public class main {
    public static void main(String[] args) {
        // create an empty array of vehicles
        Vehicle[] vehicles = new Vehicle[10];

        // creates a jeep object with the determined attributes
        Jeep jeep = new Jeep("Suspicious Red Jeep", 6, 80, 6);

        // Insert the jeep to the list
        vehicles[0] = jeep;

        // Create a frigate object with the determined attributes.
        Frigate frigate = new Frigate("Titanic 2", 30, 40, 20);

        // Insert the frigate into the list
        vehicles[1] = frigate;

        // Create a hoverCraft object with the determined attributes
        HoverCraft hoverCraft = new HoverCraft("Elon Musk's sick new invention", 300, 1000, 0, 0);

        // Insert the hoverCraft object to the list.
        vehicles[2] = hoverCraft;

        // Creates a policeCar object with the determined attributes
        PoliceCar policeCar = new PoliceCar("80's Cruiser", 4, 200, 4);

        // Insert the policeCar into the list.
        vehicles[3] = policeCar;

        // Testing the policeCar inspect method.
        policeCar.inspect(vehicles[2]);

        // testing the policeCar inspect method after changing the shift status
        policeCar.changeShift();
        policeCar.inspect(vehicles[2]);
    }
}
