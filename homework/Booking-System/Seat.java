package groupproject;

public class Seat {
    int seatNumber;
    boolean openSeat;

    Seat(int seatNumber){
        this.seatNumber =seatNumber;
        this.openSeat = true;
    }
    public boolean isOpen(){
        return openSeat;
    }

    public void book(){
        openSeat = false;
    }

    public void cancel(){
        openSeat = true;
    }
}
//This class is used to define the seats. It's kinda where I started but I kept it around