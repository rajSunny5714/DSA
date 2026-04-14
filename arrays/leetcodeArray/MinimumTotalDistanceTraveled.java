package arrays.leetcodeArray;

import java.util.*;
public class MinimumTotalDistanceTraveled{
    public long minimumTotalDistance(List<Integer> robot,int[][] factory){
        Collections.sort(robot);
        Arrays.sort(factory,(a,b)->a[0]-b[0]);
        int n=robot.size(),m=factory.length;
        Long[][] dp=new Long[n][m];
        return solve(0,0,robot,factory,dp);
    }
    private long solve(int i,int j,List<Integer> robot,int[][] factory,Long[][] dp){
        if(i==robot.size())return 0;
        if(j==factory.length)return Long.MAX_VALUE/2;
        if(dp[i][j]!=null)return dp[i][j];
        long res=solve(i,j+1,robot,factory,dp),cost=0;
        for(int k=0;k<factory[j][1]&&i+k<robot.size();k++){
            cost+=Math.abs(robot.get(i+k)-factory[j][0]);
            res=Math.min(res,cost+solve(i+k+1,j+1,robot,factory,dp));
        }
        return dp[i][j]=res;
    }
    public static void main(String[] args){
        MinimumTotalDistanceTraveled obj=new MinimumTotalDistanceTraveled();
        List<Integer> robot=Arrays.asList(0,4,6);
        int[][] factory={{2,2},{6,2}};
        System.out.println(obj.minimumTotalDistance(robot,factory));
    }
}