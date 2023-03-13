import java.util.Date;
public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date Date, int officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, Date);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Class Name: Faculty\nName: " + getName() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nHire Date: " + getDate() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}