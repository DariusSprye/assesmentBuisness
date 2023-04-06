package buisness;

public class HourlyEmployee extends Employee{
    public double hoursWorked;
    public double hourlyRate;

    public HourlyEmployee(String name) {
        super(name);
    }

    public static double calculatePay(double hoursWorked, double hourlyRate){
        System.out.println("You've made: ");
        return  hourlyRate * hoursWorked;

    }
}
