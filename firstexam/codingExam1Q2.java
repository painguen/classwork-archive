package Exams.Exam1;
import java.util.Scanner;
public class codingExam1Q2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int highway;
        int servicingHighway;
        int hundred;
        hundred = 100;
        System.out.println("This program will decide which direction your highway is going.");
        System.out.println("When ready, please input your highway number.");
        highway = keyboard.nextInt();
        servicingHighway = highway;
        while(highway == 0 || highway > 999){
            System.out.println("Please try again.");
            highway = keyboard.nextInt();
            servicingHighway = highway;
        }
        while(servicingHighway > 100){
            servicingHighway -= hundred;
        }
        if(highway <= 100){
            if(isEven(highway)){
                System.out.println("I-" + highway+ "is primary, going east/west");
            }
            else{
                System.out.println("I-" + highway+ "is primary, going north/south");
            }
        }
        else{
            if(isEven(highway)){
                System.out.println("I-" + highway+"is auxiliary servicing I-" + servicingHighway+ ", going east/west");
            }
            else{
                System.out.println("I-" + highway+"is auxiliary servicing I-" + servicingHighway+ ", going north/south");
            }
        }
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

// first as the number
// check if the number is even
// if even then decide if the nubmber is above or equal to 101 if is then its a Aux
//if its just even then its primary going east/west
//if its not even but its above its a aux going north/south
//probably want to use two methods here to check if the number is even then if its above 100 :P