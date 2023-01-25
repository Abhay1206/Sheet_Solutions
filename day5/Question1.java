package day5;

import java.util.HashMap;

public class Question1 {

	public static void main(String[] args) {
		// To check if any subarray has sum equal to 0 or not
		
		int arr[]= {4,2,-3,1,5};
		
  System.out.println(sum(arr,arr.length));
	}
	
	static boolean sum(int arr[],int n) {
		  HashMap<Integer,Integer> map = new HashMap<>();
	        
	        int sum=0;
	        for(int i=0;i<n;i++){
	            sum+=arr[i];
	            if(sum==0)return true;
	            if(map.get(sum)!=null){
	                return true;
	            }else{
	                map.put(sum,i);
	            }
	        }
	        return false;
	}

}
