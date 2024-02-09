package travelagency;

public class Main {
    public static void main(String[] args) {
        // Create a Travel Packages
        TravelPackage europePackage = new TravelPackage("Europe Tour", 20);
        TravelPackage asiaPackage = new TravelPackage("Asia Tour", 50);

        // Create Destinations for europe package
        Destination paris = new Destination("Paris");
        Destination rome = new Destination("Rome");

        // Create Destinations for asia package
        Destination india = new Destination("India");
        Destination china = new Destination("China");

        // Add Activities to Euro Destinations
        Activity sightseeing = new Activity("Sightseeing", "Visit famous landmarks", 50.0, 10, paris);
        Activity museumTour = new Activity("Museum Tour", "Explore museums", 30.0, 15, rome);
        paris.addActivity(sightseeing);
        rome.addActivity(museumTour);

        // Add Activities to Asia Destinations
        Activity tajMahal = new Activity("TajMahal", "Visit famous landmarks", 60.0, 20, india);
        Activity greatWallOfChina = new Activity("GreatWallOfChina", "Visit Great Wall of China 13,171 miles long wall, built in sections over more than 2,000 years", 30.0, 15, china);
        india.addActivity(tajMahal);
        china.addActivity(greatWallOfChina);

        // Add Destinations to Travel Package Euro
        europePackage.addDestination(paris);
        europePackage.addDestination(rome);

        // Add Destinations to Travel Package Asia
        asiaPackage.addDestination(india);
        asiaPackage.addDestination(china);

        // Create Passengers for Euro Travel Package
        Passenger john = new StandardPassenger("John Doe", 1, 500.0);
        Passenger alice = new GoldPassenger("Alice Smith", 2, 700.0);
        Passenger bob = new PremiumPassenger("Bob Johnson", 3);

        // Create Passengers for Asia Travel Package
        Passenger virat = new StandardPassenger("Virat Kholi", 10, 1000.0);
        Passenger dhoni = new GoldPassenger("Dhoni MS", 20, 2000.0);

        // Add Passengers to Euro Travel Package
        europePackage.addPassenger(john);
        europePackage.addPassenger(alice);
        europePackage.addPassenger(bob);

        // Add Passengers to Asia Travel Package
        asiaPackage.addPassenger(virat);
        asiaPackage.addPassenger(dhoni);


        // Book Activities for Euro Passengers
        sightseeing.bookActivity(john);
        museumTour.bookActivity(alice);

        // Book Activities for Asia Passengers
        tajMahal.bookActivity(virat);
        greatWallOfChina.bookActivity(dhoni);

        // Print Itinerary and Passenger List for euro package
        europePackage.printItinerary();
        europePackage.printPassengerList();

        // Print Itinerary and Passenger List for asia package
        asiaPackage.printItinerary();
        asiaPackage.printPassengerList();

        //Print All the Activities having Available Space

    }
}
