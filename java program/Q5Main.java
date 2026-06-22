
interface ResultProcessor {
    double calculateGrade(double marks);
    void displayResult(String studentName, double marks);
}

class EngineeringDepartment implements ResultProcessor {
    @Override
    public double calculateGrade(double marks) {
        return marks >= 90 ? 4.0 :
                marks >= 80 ? 3.7 :
                marks >= 70 ? 3.3 :
                marks >= 60 ? 2.7 : 1.0;
    }

    @Override
    public void displayResult(String studentName, double marks) {
        System.out.println("[Engineering] " + studentName +
                " | Marks: " + marks + " | GPA: " + calculateGrade(marks));
    }
}

class ManagementDepartment implements ResultProcessor {
    @Override
    public double calculateGrade(double marks) {
        return marks >= 85 ? 4.0 :
                marks >= 75 ? 3.5 :
                marks >= 65 ? 3.0 :
                marks >= 55 ? 2.5 : 1.5;
    }

    @Override
    public void displayResult(String studentName, double marks) {
        System.out.println("[Management] " + studentName +
                " | Marks: " + marks + " | GPA: " + calculateGrade(marks));
    }
}

public class Q5Main {
    public static void main(String[] args) {
        ResultProcessor eng = new EngineeringDepartment();
        ResultProcessor mgmt = new ManagementDepartment();
        eng.displayResult("Rohan Shrestha", 88);
        mgmt.displayResult("Priya Maharjan", 88);
    }
}