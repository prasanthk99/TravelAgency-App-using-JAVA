package travelagency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardPassengerTest {

    // Method to test add activity to StandardPassenger with destination and check the balance
    @Test
    public void testAddActivityWithBalanceDeduction() {
        StandardPassenger standardPassenger = new StandardPassenger("John Doe", 1, 500.0);
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);

        standardPassenger.addActivity(activity);

        // Check activity added to StandardPassenger
        assertTrue(standardPassenger.getActivities().contains(activity));

        // Check balance equals of StandardPassenger after deduction
        assertEquals(450.0, standardPassenger.getBalance(), 0.001);
    }

}