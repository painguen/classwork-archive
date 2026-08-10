public class PoliceOfficer {
    private final String officerName;
    private final int badgeNumber;

    public PoliceOfficer(String officerName, int badgeNumber) {
        this.officerName = officerName;
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return officerName;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public ParkingTicket inspectParkedCar(ParkedCar car, ParkingMeter meter) {
        int overdueMinutes = car.getMinutesParked() - meter.getMinutesPurchased();

        if (overdueMinutes > 0) {
            return new ParkingTicket(car, this, overdueMinutes);
        } else {
            System.out.println("Tthe car is legally parked.");
            return null;
        }
    }

    public static void main(String[] args) {
        ParkedCar c1 = new ParkedCar("Dodge", "Charger", 738493, 265);
        ParkedCar c2 = new ParkedCar("Mercedes", "Bens", 69420, 30);

        ParkingMeter meter1 = new ParkingMeter(60);
        ParkingMeter meter2 = new ParkingMeter(60);

        PoliceOfficer officer = new PoliceOfficer("John Doe", 9876);

        ParkingTicket ticket1 = officer.inspectParkedCar(c1, meter1);
        ParkingTicket ticket2 = officer.inspectParkedCar(c2, meter2);

        if (ticket1 != null) {
            ticket1.printTicketDetails();
        }
        if (ticket2 != null) {
            ticket2.printTicketDetails();
        }
    }
}