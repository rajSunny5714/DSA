package BasicsJava;

public class Student {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age>=0&&age<=120){
            this.age=age;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        Student s=new Student();
        s.setName("Sunny");
        s.setAge(22);
        s.setAge(-5);
        System.out.print("Student name: "+s.getName()+"\nStudent's Age: "+s.getAge());
    }
}