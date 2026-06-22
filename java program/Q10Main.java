
abstract class Scholarship {
    protected String studentName;
    protected double cgpa;
    protected double familyIncome;

    public Scholarship(String studentName, double cgpa, double familyIncome) {
        this.studentName = studentName;
        this.cgpa = cgpa;
        this.familyIncome = familyIncome;
    }

    public abstract boolean isEligible();
    public abstract double getAmount();

    public void displayResult() {
        if (isEligible()) {
            System.out.println(studentName + " is ELIGIBLE for " +
                    getClass().getSimpleName() + ". Amount: Rs. " + getAmount());
        } else {
            System.out.println(studentName + " is NOT eligible for " +
                    getClass().getSimpleName() + ".");
        }
    }
}

class MeritScholarship extends Scholarship {
    public MeritScholarship(String name, double cgpa, double income) {
        super(name, cgpa, income);
    }

    @Override
    public boolean isEligible() { return cgpa >= 3.7; }

    @Override
    public double getAmount() { return 50000.0; }
}

class NeedBasedScholarship extends Scholarship {
    public NeedBasedScholarship(String name, double cgpa, double income) {
        super(name, cgpa, income);
    }

    @Override
    public boolean isEligible() { return familyIncome < 200000; }

    @Override
    public double getAmount() { return 30000.0; }
}

public class Q10Main {
    public static void main(String[] args) {
        Scholarship s1 = new MeritScholarship("Sallu Malik", 3.8, 350000);
        Scholarship s2 = new NeedBasedScholarship("Anshu Magar", 3.2, 120000);
        Scholarship s3 = new MeritScholarship("Dipika Tharu", 3.5, 180000);
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
    }
}