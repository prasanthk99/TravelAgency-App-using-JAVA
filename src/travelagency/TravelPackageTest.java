package travelagency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravelPackageTest {

    // Function to Test adding destination to travelPackage
    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 20);
        Destination destination = new Destination("Paris");

        travelPackage.addDestination(destination);

        assertTrue(travelPackage.getItinerary().contains(destination));
    }

    // Function to Test adding passenger to travelPackage
    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 20);
        Passenger passenger = new StandardPassenger("John Doe", 1, 500.0);

        travelPackage.addPassenger(passenger);

        assertTrue(travelPackage.getPassengerList().contains(passenger));
    }
}