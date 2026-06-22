
import java.util.ArrayList;

class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
}

class Student3 {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student3(String name) {
        this.name = name;
    }

    public void registerCourse(Course c) {
        courses.add(c);
    }

    public void displayCourses() {
        System.out.println("Student: " + name);
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println("  - " + c.getCourseCode() + " : " + c.getCourseName());
        }
    }
}

public class Q3Main {
    public static void main(String[] args) {
        Student3 s = new Student3("Bikash KC");
        s.registerCourse(new Course("Object Oriented Programming", "BCSNT6063"));
        s.registerCourse(new Course("Data Structures", "BCSNT6041"));
        s.registerCourse(new Course("Database Management", "BCSNT6052"));
        s.displayCourses();
    }
}