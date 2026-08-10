package bookingsystem;

import java.util.List;
import java.util.ArrayList;

public class BookingSystem {
    List<Transportation> Transport;

    public BookingSystem() {
        Transport = new ArrayList<>();
        Transport.add(new Transportation(1,"Bus" , "CityA", "CityB", "01-12-2024", "08:00 AM", 10));
        Transport.add(new Transportation(2, "Train" , "CityA", "CityC", "01-12-2024", "09:00 AM", 20));
        Transport.add(new Transportation(3, "Train", "CityB", "CityC", "02-12-2024", "02:00 PM", 15));
    } //This booking system class is what holds are open transport

    void searchTransport(String sourceStation, String destination, String date) {
        System.out.println("Search Results:");
        boolean found = false;
        for (Transportation vehicle : Transport) {
            if (vehicle.sourceStation.equalsIgnoreCase(sourceStation) &&
                vehicle.destination.equalsIgnoreCase(destination) &&
                vehicle.date.equals(date)) {
                System.out.printf("ID: %s | Type %s | Time: %s | Available Seats: %d%n",
                vehicle.id, vehicle.type, vehicle.time, vehicle.getAvailableSeats().size());
                found = true;
            }
        } //Searches for any open transport and displays it back to the user
        if (!found) {
            System.out.println("No transport found for the given route and date.");
        }
    }
    //
    public void bookTicket(int vehicleId, int seatNumber) {
        for (Transportation vehicle : Transport) {
            if (vehicle.id == vehicleId) {
                if (vehicle.bookSeat(seatNumber)) {
                    System.out.println("Seat " + seatNumber + " successfully booked.");
                } else {
                    System.out.println("Seat " + seatNumber + " is already booked.");
                }
                return;
            }
        }
        System.out.println("ID not found.");
    }

    public void listAvailableTransport() {
        System.out.println("Available Buses:");
        int busCount = 0;
        for (Transportation vehicle : Transport) {
            if (vehicle.getType().equals("Bus") && vehicle.hasAvailableSeats()) {
                System.out.printf("ID: %s | From: %s | To: %s | Date: %s | Time: %s | Available Seats: %d%n",
                        vehicle.id, vehicle.sourceStation, vehicle.destination, vehicle.date, vehicle.time, vehicle.getAvailableSeats().size());
                busCount++;
            }
        }
        if (busCount == 0) {
            System.out.println("No buses with available seats.");
        }
    
        System.out.println("\nAvailable Trains:");
        int trainCount = 0;
        for (Transportation vehicle : Transport) {
            if (vehicle.getType().equals("Train") && vehicle.hasAvailableSeats()) {
                System.out.printf("ID: %s | From: %s | To: %s | Date: %s | Time: %s | Available Seats: %d%n",
                        vehicle.id, vehicle.sourceStation, vehicle.destination, vehicle.date, vehicle.time, vehicle.getAvailableSeats().size());
                trainCount++;
            }
        }
        if (trainCount == 0) {
            System.out.println("No trains with available seats.");
        }
    }
}
