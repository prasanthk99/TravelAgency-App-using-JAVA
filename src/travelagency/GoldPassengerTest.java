package travelagency;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoldPassengerTest {

    // Method to test add activity to GodPassenger with destination and check the balace after discount
    @Test
    public void testAddActivityWithDiscount() {
        GoldPassenger goldPassenger = new GoldPassenger("Alice Smith", 2, 700.0);
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);

        goldPassenger.addActivity(activity);

        // Check activity added to GoldPassenger
        assertTrue(goldPassenger.getActivities().contains(activity));

        // Check balance equals of GoldPassenger after deduction
        assertEquals(655.0, goldPassenger.getBalance(), 0.001);
    }

}