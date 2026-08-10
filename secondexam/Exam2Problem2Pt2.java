package Exams2.Exam2Problem1;

public class Exam2Problem2Pt2 extends Exam2Problem2{
    private double fileSize;
    public Exam2Problem2Pt2(String title, String author, int year, double fileSize){
        super(title, author, year);
        this.fileSize = fileSize;
    }
    @Override
    public String getInfo() {
    return super.getInfo() + "\n File Size: [" + fileSize + "]";
    }
}