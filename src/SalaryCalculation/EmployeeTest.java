package SalaryCalculation;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee firstEmployee = new FullTimeEmployee("Vardan",3);
        firstEmployee.processPayment(3000);
        PartTimeEmployee secondEmployee = new PartTimeEmployee("Michael",4);
        secondEmployee.processPayment(4000);
    }
}
