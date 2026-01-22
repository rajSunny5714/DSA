import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class GiveBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        if(salary<10000)
            salary+=1000;
        else
            salary+=2000;
        System.out.println("After Bonus included salary is: "+salary);
    }
}
