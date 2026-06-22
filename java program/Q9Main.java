
class StudentID {
    private static int counter = 1000;

    private int studentId;
    private String name;

    public StudentID(String name) {
        this.name = name;
        this.studentId = ++counter;
    }

    public void display() {
        System.out.println("ID: " + studentId + " | Name: " + name);
    }
}

public class Q9Main {
    public static void main(String[] args) {
        StudentID s1 = new StudentID("Sallu Malik ");
        StudentID s2 = new StudentID("Binita Lama");
        StudentID s3 = new StudentID("Anshu Magar");
        s1.display();
        s2.display();
        s3.display();
    }
}