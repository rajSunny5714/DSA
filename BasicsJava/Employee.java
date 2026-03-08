package BasicsJava;

class Person{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Employee extends Person{
    private int empId;
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public int getEmpId(){
        return empId;
    }
    public static void main(String[] args){
        Employee e=new Employee();
        e.setName("Sunny");
        e.setEmpId(101);
        System.out.print("Employee Name: "+e.getName()+"\nEmployee Id: "+e.getEmpId());
    }
}