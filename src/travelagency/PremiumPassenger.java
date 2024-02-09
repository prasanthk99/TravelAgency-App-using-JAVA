package travelagency;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, 0.0); // Premium passengers have a balance of 0
    }
}
