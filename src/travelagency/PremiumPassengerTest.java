package travelagency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumPassengerTest {

    // Method to test add activity to PremiumPassenger with destination and check the balance
    @Test
    public void testAddActivityWithoutBalanceDeduction() {
        PremiumPassenger premiumPassenger = new PremiumPassenger("Bob Johnson", 3);
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, destination);

        premiumPassenger.addActivity(activity);

        // Check activity added to PremiumPassenger
        assertTrue(premiumPassenger.getActivities().contains(activity));

        // Check balance equals of PremiumPassenger after deduction
        assertEquals(0.0, premiumPassenger.getBalance(), 0.001);
    }

}