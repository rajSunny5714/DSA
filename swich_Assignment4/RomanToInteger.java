package swich_Assignment4;

import java.util.Scanner;
public class RomanToInteger {
    public int romanToInt(String s) {
        int total = 0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            int next = (i < s.length() - 1) ? getValue(s.charAt(i + 1)) : 0;

            if(current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }
    private int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman number: ");
        String roman = sc.next();

        int result = obj.romanToInt(roman);
        if(result == -1) {
            System.out.println("Invalid Roman Number!");
        } else {
            System.out.println("Roman: " +roman);
            System.out.println("Integer: " +result);
        }
    }
}