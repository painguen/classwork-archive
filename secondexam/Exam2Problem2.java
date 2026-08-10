package Exams2.Exam2Problem1;

public class Exam2Problem2 {
    private String title;
    private String author;
    private int year;

    public Exam2Problem2(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getInfo() {
        return "\n Title: ["+title+"] \n Author: ["+author+"] \n Year: ["+year+"]";
    }
    public static void main(String[] args) {
        Exam2Problem2 exam2Problem2 = new Exam2Problem2("1984", "George Orwell", 1949);
        Exam2Problem2Pt2 exam2Problem2Pt2 = new Exam2Problem2Pt2("Snow Crash", "Neal Stephenson", 1992, 2.5);

        System.out.println(exam2Problem2.getInfo());
        System.out.println(exam2Problem2Pt2.getInfo());
    }
}