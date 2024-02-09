package travelagency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengerList;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengerList = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void printItinerary() {
        System.out.println("-----------------***** Travel Package: " + name +" *****--------------");
        for (Destination destination : itinerary) {
            destination.printDetails();
        }
//        System.out.println("-------*******-------");
    }


    public void addPassenger(Passenger passenger) {
        if (passengerList.size() < passengerCapacity) {
            passengerList.add(passenger);
        } else {
            System.out.println("Passenger limit reached for this package!");
        }
    }

    public void printPassengerList() {
        System.out.println(" ------------***** Passenger List for Package: " + name + " *****------------ ");
        System.out.println("No Of Passengers Enrolled : " + noOfPeopleEnrolled());
        System.out.println(" ----------------------- ");
        for (Passenger passenger : passengerList) {
            passenger.printDetails();
        }
    }

    public int noOfPeopleEnrolled(){
        return passengerList.size();
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }
}
