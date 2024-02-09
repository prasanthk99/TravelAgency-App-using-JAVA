# Travel Agency System

This project is a simple implementation of a travel agency system in Java. It allows travel agencies to maintain travel packages' itinerary and passengers.

## High-Level Diagram

Please take a look at the url provided below.
https://drive.google.com/file/d/1wylJySVpFVHtQU9RXYgWDWeC_9XI7ZeJ/view?usp=drive_link

## Low-Level Diagram

Please take a look at the url provided below.
https://drive.google.com/file/d/1o9i17GYmM6MCbgAL227kFBysxPBSQ9Ha/view?usp=drive_link

## Classes

### 1. TravelPackage
- Represents a travel package with a name, passenger capacity, itinerary (list of destinations), and a list of passengers.

### 2. Destination
- Represents a destination with a name and a list of activities available at that destination.

### 3. Activity
- Represents an activity with a name, description, cost, and capacity. Each activity is available at one destination only.

### 4. Passenger
- Represents a passenger with a name, passenger number, balance, and a list of activities signed up for.

### 5. StandardPassenger
- Subclass of Passenger. Has a balance, and each time a standard passenger signs up for an activity, the cost is deducted from their balance.

### 6. GoldPassenger
- Subclass of Passenger. Has a balance, and a 10% discount is applied on the cost of the activity when signing up.

### 7. PremiumPassenger
- Subclass of Passenger. Can sign up for activities for free.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/prasanthk99/TravelPackage-Design-App-using-JAVA
