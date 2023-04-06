package buisness;

public class SalariedEmployee extends Employee{
    public double salary;

    public SalariedEmployee(String edwin) {
        super(edwin);
    }

    public static double calculatePay(double salary) {
        System.out.println("You've made: ");
        return salary;

    }

}
