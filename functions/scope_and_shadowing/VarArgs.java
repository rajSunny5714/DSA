package functions.scope_and_shadowing;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        varArgs(2,3,66,878,543,334);
        varArgs0();
        varArgs1("Sunny", "Raj", "Jha");
        varArgs2(2,5, "Sunny", "Raj", "Jha");
    }
    private static void varArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }
    private static void varArgs0(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    private static void varArgs1(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    private static void varArgs2(int a, int b, String ...v) {
        System.out.println(a+", "+b+", "+Arrays.toString(v));
    }
}
