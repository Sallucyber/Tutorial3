class Attendance {
    protected String studentName;
    protected int presentDays;
    protected int totalDays;

    public Attendance(String studentName, int presentDays, int totalDays) {
        this.studentName = studentName;
        this.presentDays = presentDays;
        this.totalDays = totalDays;
    }

    public double calculateAttendance() {
        return (presentDays * 100.0) / totalDays;
    }

    public void displayAttendance() {
        System.out.println(studentName + " | Attendance: " +
                String.format("%.2f", calculateAttendance()) + "%");
    }
}

class EngineeringAttendance extends Attendance {
    public EngineeringAttendance(String name, int present, int total) {
        super(name, present, total);
    }

    @Override
    public double calculateAttendance() {
        return (presentDays * 1.1 * 100.0) / totalDays;
    }
}

class MedicalAttendance extends Attendance {
    public MedicalAttendance(String name, int present, int total) {
        super(name, present, total);
    }

    @Override
    public double calculateAttendance() {
        double percent = (presentDays * 100.0) / totalDays;
        return percent < 80 ? percent - 5 : percent;
    }
}

public class Q7Main {
    public static void main(String[] args) {
        Attendance eng = new EngineeringAttendance("Sallu Malik", 70, 100);
        Attendance med = new MedicalAttendance("Amrita Karki", 75, 100);
        eng.displayAttendance();
        med.displayAttendance();
    }
}