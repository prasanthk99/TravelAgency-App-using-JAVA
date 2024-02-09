package travelagency;

import static org.junit.jupiter.api.Assertions.*;

class ActivityTest {

    // Method to Test book activity and balance
    @org.junit.jupiter.api.Test
    public void testBookActivity() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);
        Passenger passenger = new StandardPassenger("John Doe", 1, 500.0);

        activity.bookActivity(passenger);

        assertTrue(passenger.getActivities().contains(activity));
        assertEquals(450.0, passenger.getBalance(), 0.001);
    }
}