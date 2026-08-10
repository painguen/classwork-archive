package bookingsystem;
import java.util.Scanner;
//Welcome to the main program!
public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();
        //I used a while true here because i read something similar that had it. This allows us to loop back out of the start if not exiting.
        while (true) {
            System.out.println("\nTicket Booking System");
            System.out.println("1. Search By Date");
            System.out.println("2. Search all Seats");
            System.out.println("3. Book Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            //The menu for selection for what the user wants to do
            switch (choice) {
                case 1: //This lets the user search for any transport on their date to their destination 
                    System.out.print("Enter Starting Station: ");
                    String sourceStation = scanner.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter date (DD-MM-YYYY): ");
                    String date = scanner.nextLine();
                    bookingSystem.searchTransport(sourceStation, destination, date);
                    break;
                case 2:
                    bookingSystem.listAvailableTransport(); //This is made a easier way just to see the transport because it got tiring looking back at the code to check the dates. 
                    break;
                case 3: //This books the transport the person picks 
                System.out.print("Enter transport ID: ");
                int vehicleId = scanner.nextInt();
                System.out.print("Enter seat number: ");
                int seatNumber = scanner.nextInt();
                bookingSystem.bookTicket(vehicleId, seatNumber);
                break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
