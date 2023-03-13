import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date Date;
    public Employee()
    {
    	super();
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date Date) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.Date = Date;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDate() {
        return Date;
    }

    @Override
    public String toString() {
        return "Class Name: Employee\nName: " + getName() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate hired: " + Date;
    }
}