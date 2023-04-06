package buisness;

public class PersonTest{

    public static void main(String[] args) {

        Entrepreneur Darius = new Entrepreneur("Darius");
        SalariedEmployee Edwin = new SalariedEmployee("Edwin");
        HourlyEmployee slaveToTheMatrix = new HourlyEmployee("slaveToTheMatrix");

        Employee.printBadge();
        System.out.println(HourlyEmployee.calculatePay(40, 85));

        Employee.printBadge();
        System.out.println(SalariedEmployee.calculatePay(7000));

        System.out.println(Entrepreneur.calculatePay(80000,20000));














    }


}
