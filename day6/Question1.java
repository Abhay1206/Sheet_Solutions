package day6;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int prices[]= {3,3,5,0,0,3,1,4};
       int n = prices.length;
       
       int[][][] dp = new int[n][2][3];
       for(int[][] row : dp){
           for(int[] col : row){
               Arrays.fill(col, -1);
           }
       }
       System.out.println(res(0,prices,0,2,dp));
	}

	static  int res(int i,int prices[],int bOs,int k,int dp[][][]){
        if(i>=prices.length || k==0)return 0;
     if(dp[i][bOs][k] != -1) return dp[i][bOs][k];
        int x=0;
        if(bOs==0){
            int buy = res(i+1,prices,1,k,dp) -prices[i];
            int noBuy =res(i+1,prices,0,k,dp);
            x=Math.max(buy,noBuy);
        }else{
            int sell = res(i+1,prices,0,k-1,dp) +prices[i];
            int noSell =res(i+1,prices,1,k,dp);
            x=Math.max(sell,noSell);
        }
    
        return dp[i][bOs][k]=x;
    }
}
