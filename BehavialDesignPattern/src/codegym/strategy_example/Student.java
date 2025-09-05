package codegym.strategy_example;

public class Student implements Comparable<Student> {
    private String rollNo;
    private String fullName;
    private double marks;

    public Student(String rollNo, String fullName, double marks) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.marks = marks;
    }

    /* Hai sinh viên so sánh với nhau theo tên (fullName) */
    @Override
    public int compareTo(Student o) {
        if (o == null || o.fullName == null) {
            return 1;
        }
        if (this.fullName == null) {
            return -1;
        }
        return this.fullName.compareTo(o.fullName);
    }

    @Override
    public String toString() {
        return rollNo + " – " + fullName;
    }
}
