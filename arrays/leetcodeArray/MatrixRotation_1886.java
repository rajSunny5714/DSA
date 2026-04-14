package arrays.leetcodeArray;

import java.util.*;
public class MatrixRotation_1886 {
    public boolean findRotation(int[][] mat,int[][] target){
        for(int i=0;i<4;i++){
            if(isEqual(mat,target))return true;
            mat=rotate(mat);
        }
        return false;
    }
    private int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][n-i-1]=mat[i][j];
            }
        }
        return res;
    }
    private boolean isEqual(int[][] mat,int[][] target){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j])return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        int[][] target=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                target[i][j]=sc.nextInt();
            }
        }
        MatrixRotation_1886 obj=new MatrixRotation_1886();
        System.out.println(obj.findRotation(mat,target));
    }
}
