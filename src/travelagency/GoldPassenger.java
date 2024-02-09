package travelagency;

public class GoldPassenger extends Passenger {
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
    }

    @Override
    public void addActivity(Activity activity) {
        getActivities().add(activity);
        if (activity.isSpaceAvailable()) {
            setBalance(getBalance() - activity.getCost() * 0.9); // 10% discount for gold passengers
        }
    }
}
