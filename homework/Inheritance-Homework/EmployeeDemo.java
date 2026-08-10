package homework_Inheritance;

public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 50000, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 20, 25);
        ContractEmployee contractEmployee = new ContractEmployee("Charlie", 20000);
        fullTimeEmployee.displayEmployeeInfo();
        partTimeEmployee.displayEmployeeInfo();
        contractEmployee.displayEmployeeInfo();
    }
}
