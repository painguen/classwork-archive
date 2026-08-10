package homework_Inheritance;

public class ContractEmployee extends Employee {
    private double contractAmount;
    public ContractEmployee(String name, double contractAmount){
        super(name, 0);
        this.contractAmount = contractAmount;
    }
    public double calculateSalary(){
        return contractAmount;
    }
}
