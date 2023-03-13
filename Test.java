import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Kozak Braci", "1 Maji", "123-456-7891", "kozak@email");
        Student s = new Student("Luiz Ejlli", "2 Maji", "568-515-7216", "luani@email", StudentStatus.SOPHOMORE);
        Employee e = new Employee("Kiara Tito", "3 Maji", "555-555-1385", "luanesha@email", "123A", 452163, new Date());
        Faculty f = new Faculty("Olta Gixhari", "4 Maji", "111-000-2605", "sbokjo@email", "456B", 5, new Date(), 10, "Professor");
        Staff st = new Staff("Amos Zaharia", "5 Maji", "222-335-2325", "amosmuji@email", "789C", 1, new Date(), "Department Head");

        System.out.println(p.toString());
        System.out.println("\n");
        System.out.println(s.toString());
        System.out.println("\n");
        System.out.println(e.toString());
        System.out.println("\n");
        System.out.println(f.toString());
        System.out.println("\n");
        System.out.println(st.toString());
    }
}