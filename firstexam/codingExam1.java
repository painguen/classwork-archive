package Exams.Exam1;
import java.util.Scanner;

public class codingExam1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int firstInput;
        int secondInput;
        int thirdInput;
        System.out.print("Please input three different integars.\n At the end we will compare the three\n And give back the smallest and largest.");
        System.out.println("\nPlease put your first int: ");
        firstInput = keyboard.nextInt();
        System.out.println("Please put your second int: ");
        secondInput = keyboard.nextInt();
        System.out.println("Please put your third int: ");
        thirdInput = keyboard.nextInt();
        int smallest = smallestNumber(firstInput, secondInput, thirdInput);
        int largest = largestNumber(firstInput, secondInput, thirdInput);
        System.out.println("Your largest number is : "+largest);
        System.out.println("Your smallest number is : "+smallest);
    }
    
    public static int largestNumber(int firstInput, int secondInput, int thirdInput){
        int largest;
        largest = firstInput;
        if (secondInput > largest){
            largest = secondInput;
        }
        else if(thirdInput > largest){
            largest = thirdInput;
        }
        return largest;
    }
    public static int smallestNumber(int firstInput, int secondInput, int thirdInput){
        int smallest;
        smallest = firstInput;
        if (secondInput < smallest){
            smallest = secondInput;
        }
        else if(thirdInput < smallest){
            smallest = thirdInput;
        }
        return smallest;
    }
}
