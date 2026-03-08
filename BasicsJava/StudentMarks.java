package BasicsJava;
public class StudentMarks {
    int marks;
    StudentMarks(int marks) {
        this.marks = marks;
    }
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks(85);
        System.out.println(s.marks);
    }
}