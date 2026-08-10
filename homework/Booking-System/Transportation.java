package groupproject;

import java.util.ArrayList;
import java.util.List;

public class Transportation {
        int id;
        String type;
        String sourceStation;
        String destination;
        String date;
        String time;
        List<Seat> seats;
    //This is the main constructor for the transport it allows us to use the same things for trains and busses
        public Transportation(int id, String type, String sourceStation, String destination, String date, String time, int totalSeats){
            this.id = id;
            this.type = type;
            this.sourceStation = sourceStation;
            this.destination = destination;
            this.date = date;
            this.time = time;
            this.seats = new ArrayList<>();
            for (int loops = 1; loops <= totalSeats; loops++) {
                seats.add(new Seat(loops));
            }
        }
        //Listing all the seats open for an idea that was scrapped but left over since it stops the user from just putting in the same seat twice
    public List<Seat> getAvailableSeats() {
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : seats) {
            if (seat.isOpen()) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }
    //books a seat and sets the seat open to false
    public boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return false;
        }
        Seat seat = seats.get(seatNumber - 1);
        if (seat.isOpen()) {
            seat.book();
            System.out.println("Seat " + seatNumber + " successfully booked.");
            return true;
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        }
    }
    //uses an array list to show you how many seats are available
    public void displayAvailableSeats() {
        List<Seat> availableSeats = getAvailableSeats();
        if (availableSeats.isEmpty()) {
            System.out.println("No available seats.");
        } else {
            System.out.print("Available seats: ");
            for (Seat seat : availableSeats) {
                System.out.print(seat.seatNumber + " ");
            }
            System.out.println();
        }
    }
    //This checks to see if theres any seats left and returns it if there is more than 0 
    public boolean hasAvailableSeats() {
        return getAvailableSeats().size() > 0;
    }

    public String getType() {
        return type;
    }
}
