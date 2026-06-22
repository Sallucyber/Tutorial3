
abstract class StudentFee {
    protected String name;

    public StudentFee(String name) {
        this.name = name;
    }

    public abstract double calculateFee();

    public void displayFee() {
        System.out.println("Student: " + name + " | Fee: Rs. " + calculateFee());
    }
}

class Undergraduate extends StudentFee {
    public Undergraduate(String name) { super(name); }

    @Override
    public double calculateFee() { return 45000.0; }
}

class Graduate extends StudentFee {
    public Graduate(String name) { super(name); }

    @Override
    public double calculateFee() { return 65000.0; }
}

public class Q4Main {
    public static void main(String[] args) {
        StudentFee ug = new Undergraduate("Anjali Rai");
        StudentFee pg = new Graduate("Suresh Poudel");
        ug.displayFee();
        pg.displayFee();
    }
}