package travelagency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DestinationTest {

    // Function to Test adding activity to destination
    @Test
    public void testAddActivityToDestination() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);

        destination.addActivity(activity);

        assertTrue(destination.getActivities().contains(activity));
    }
}