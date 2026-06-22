
class Member {
    protected String name;
    protected int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public int borrowingLimit() { return 2; }

    public void displayInfo() {
        System.out.println("Member: " + name + " | ID: " + memberId +
                " | Borrow Limit: " + borrowingLimit() + " books");
    }
}

class StudentMember extends Member {
    public StudentMember(String name, int memberId) { super(name, memberId); }

    @Override
    public int borrowingLimit() { return 3; }
}

class TeacherMember extends Member {
    public TeacherMember(String name, int memberId) { super(name, memberId); }

    @Override
    public int borrowingLimit() { return 7; }
}

public class Q6Main {
    public static void main(String[] args) {
        Member sm = new StudentMember("Nisha Tamang", 1001);
        Member tm = new TeacherMember("Prof. Dahal", 2001);
        sm.displayInfo();
        tm.displayInfo();
    }
}