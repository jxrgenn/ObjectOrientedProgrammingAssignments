import java.util.Date;

public class Staff extends Employee {
    private String title;
    public Staff()
    {
    	super();
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date Date, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, Date);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Class Name: Staff\nName: " + getName() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nDate: " + getDate() + "\nTitle: " + title;
    }
}
