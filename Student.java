
public class Student extends Person {
	private StudentStatus status;

    public Student(String name, String address, String phoneNumber, String emailAddress, StudentStatus status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public StudentStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Class Name: Student\nName: " + getName() + "\nStudent Status: " + status;
    }
}

