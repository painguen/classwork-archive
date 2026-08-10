package homework_Inheritance;

public abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    @Override
    public String toString() {
        return "Employee Name: " + name + ", Base Salary: $" + baseSalary;
    }

    public abstract double calculateSalary();
    
    public void displayEmployeeInfo(){
        System.out.print("\nEmployee Info, Name : "+getName() + "\n Salary : " + getBaseSalary() + "\n Total Salary : " + calculateSalary());
    }
}

