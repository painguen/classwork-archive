package homework_Inheritance;

public class FullTimeEmployee extends Employee{
    private double bonus;
    public FullTimeEmployee(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    } 
}
