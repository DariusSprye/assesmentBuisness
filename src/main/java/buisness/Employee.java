package buisness;

public abstract class Employee extends Person{

    private static int ID = 0;
    private static int UniqueID;

    public Employee(String name) {
        super(name);
    }

    public static void printBadge() {
        System.out.println("Hello: " +getName());
        System.out.println("Your unique employee ID number is: " + (ID = ++UniqueID));

    }

}
