package travelagency;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public double getBalance() {
        if(balance<0) return 0;
        return balance;
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void addActivity(Activity activity) {
        getActivities().add(activity); // Use the getter method
        if (activity.isSpaceAvailable()) {
            balance -= Math.round(activity.getCost()); // 10% discount for gold passengers
        }
    }

    public void printDetails() {
        System.out.println("Passenger: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Activities:");
        for (Activity activity : getActivities()) {
            System.out.println(" - " + activity.getName() + " at " + activity.getDestination().getName());
        }
        System.out.println(" --------------------- ");

    }
}

