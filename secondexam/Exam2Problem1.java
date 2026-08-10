package Exams2.Exam2Problem1;

public class Exam2Problem1 {

public int[] numbers = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        Exam2Problem1 exam = new Exam2Problem1();
        System.out.println("Total: " + exam.getTotal());

        System.out.println("Highest Value: " + exam.getHighest());
    }

    public int getTotal(){
        int total = 0;
        for(int loops= 0; loops < numbers.length; loops++){
            total+=numbers[loops];
        }
        return total;
    }

    public int getHighest(){
        int highest = 0;
        for(int loops= 0; loops < numbers.length; loops++){
            if(highest < numbers[loops]){
                highest = numbers[loops];
            }
        }
        return highest;
    }
}
