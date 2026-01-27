package assignment1;

import java.util.Scanner;

public class FindLCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp1 = num1;
        int temp2 = num2;

        while(temp2 != 0){
           int temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        int hcf = temp1;
        int lcm = (num1*num2)/hcf;
        System.out.println("LCM= "+lcm);
        System.out.println("HCF= "+hcf);
    }
}
