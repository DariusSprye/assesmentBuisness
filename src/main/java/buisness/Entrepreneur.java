package buisness;

public class Entrepreneur extends Person{
    public Entrepreneur(String name) {
        super(name);
    }

    private double revenue;

    private double expenses;


    public static double calculatePay(double revenue, double expenses) {

        System.out.println("Hello: " +getName());
        System.out.println("You've made: ");
        return revenue - expenses;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}

