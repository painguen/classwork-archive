public class ParkedCar {
    private final String make;
    private final String model;
    private final int licensePlateNumber;
    private final int minutesParked;

    public ParkedCar(String make, String model, int licensePlateNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.licensePlateNumber = licensePlateNumber;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }
}