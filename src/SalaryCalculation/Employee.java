package SalaryCalculation;

abstract public class Employee {
    protected String name;
    protected int id;
    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
    public abstract void processPayment(double amount);
}
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int id){
    super(name,id);
}
@Override
    public void processPayment(double amount){

    System.out.println("His fixed salary is" + amount*12);
}
}
class PartTimeEmployee extends Employee{
    public PartTimeEmployee(String name,int id){
        super(name,id);
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Your hourly salary is" + amount/4/7/8);
    }
}