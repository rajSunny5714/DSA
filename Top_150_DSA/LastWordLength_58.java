package Top_150_DSA;

import java.util.Scanner;

public class LastWordLength_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LastWordLength_58 obj = new LastWordLength_58();
        int result = obj.lengthOfLastWord(str);
        System.out.println("Length : "+result);
    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
