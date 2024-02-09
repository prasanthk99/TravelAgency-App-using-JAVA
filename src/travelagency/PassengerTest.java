package travelagency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    // Function to Test adding activity to Passenger with destination and checking the balance
    @Test
    void testAddActivityToPassenger() {
        Passenger passenger = new StandardPassenger("John Doe", 1, 500.0);
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);

        passenger.addActivity(activity);

        assertTrue(passenger.getActivities().contains(activity));
        assertEquals(450.0, passenger.getBalance(), 0.001);
    }
}