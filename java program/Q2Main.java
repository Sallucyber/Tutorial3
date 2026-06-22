

class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}

class Teacher extends Employee {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name + ", ID: " + id + ", Subject: " + subject);
    }
}

class AdminStaff extends Employee {
    private String department;

    public AdminStaff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Staff: " + name + ", ID: " + id + ", Dept: " + department);
    }
}

public class Q2Main {
    public static void main(String[] args) {
        Employee t = new Teacher("Mr. Hari", 201, "Mathematics");
        Employee a = new AdminStaff("Ms. Gita", 301, "Accounts");
        t.displayDetails();
        a.displayDetails();
    }
}