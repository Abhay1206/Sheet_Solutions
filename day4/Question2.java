package day4;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices[]= {7,1,5,3,6,4};
		int res = maxProfit(prices);
		System.out.println(res);
		

	}
	
	 public static int maxProfit(int[] prices) {
	       int min =Integer.MAX_VALUE;
	        int profit=0;
	        
	        for(int i=0;i<prices.length;i++){
	            min=Math.min(min,prices[i]);
	            profit= Math.max(profit,prices[i]-min);
	        }
	        return profit;
	    }

}
