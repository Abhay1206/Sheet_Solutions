package day5;

public class Question3 {

	public static void main(String[] args) {
		// max Product subarray
		
		int arr[]= {2,3,-2,4};
		System.out.println(maxProduct(arr));

	}
	
	  public static  int maxProduct(int[] nums) {
		     
	        
	        int res=Integer.MIN_VALUE;
	        int cp=1;
	        for(int i=0;i<nums.length;i++){
	            cp*=nums[i];
	            res=Math.max(res,cp);
	            if(cp==0){
	                cp=1;
	            }
	        }
	        
	        cp=1;
	         for(int i=nums.length-1;i>=0;i--){
	            cp*=nums[i];
	            res=Math.max(res,cp);
	            if(cp==0){
	                cp=1;
	            }
	        }
	        
	        return res;
	    }

}
