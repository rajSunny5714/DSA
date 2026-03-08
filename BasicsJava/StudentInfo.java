package BasicsJava;

public class StudentInfo {
    String name;
    int age;
    void display() {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.name = "Sunny";
        s.age = 22;
        s.display();
    }
}