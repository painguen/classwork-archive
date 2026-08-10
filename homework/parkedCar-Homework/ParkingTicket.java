public class ParkingTicket {
    private final String carMake;
    private final String carModel;
    private final int licensePlateNumber;
    private final String officerName;
    private final int officerBadgeNumber;
    private final int fineAmount;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int overdueMinutes) {
        this.carMake = car.getMake();
        this.carModel = car.getModel();
        this.licensePlateNumber = car.getLicensePlateNumber();
        this.officerName = officer.getName();
        this.officerBadgeNumber = officer.getBadgeNumber();
        this.fineAmount = calculateFine(overdueMinutes);
    }

    private int calculateFine(int overdueMinutes) {
        final int baseFine = 175;
        final int additionalFinePerHour = 25;

        if (overdueMinutes <= 60) {
            return baseFine;
        } else {
            int extraHours = (overdueMinutes - 60 + 59) / 60; // Round up extra hours
            return baseFine + (extraHours * additionalFinePerHour);
        }
    }

    public void printTicketDetails() {
        System.out.println("Parking Ticket:");
        System.out.println("Officer Name: " + officerName);
        System.out.println("Badge Number: " + officerBadgeNumber);
        System.out.println("Fine Amount: $" + fineAmount);
        System.out.println("Car Make: " + carMake);
        System.out.println("Car Model: " + carModel);
        System.out.println("License Plate Number: " + licensePlateNumber);
    }
}