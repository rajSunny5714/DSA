package Conditons_Loops_assignment3A;

import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>='a' && ch<='z') {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowel: "+vowels);
        System.out.println("Consonant: "+consonants);
    }
}
