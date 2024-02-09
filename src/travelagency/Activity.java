package travelagency;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public Destination getDestination() {
        return destination;
    }

    public double getCost() {
        return cost;
    }

    public boolean isSpaceAvailable() {
        return capacity > 0;
    }

    public void bookActivity(Passenger passenger) {
        if (isSpaceAvailable()) {
            passenger.addActivity(this);
            capacity--;
        } else {
            System.out.println("Activity is fully booked!");
        }
    }

    public void printDetails() {
        System.out.println("Activity: " + name);
        System.out.println("Description: " + description);
        System.out.println("Cost: $" + cost);
        System.out.println("Capacity: " + capacity);
//        System.out.println("Destination: " + destination.getName());
        System.out.println(" --------------------- ");
    }
}
