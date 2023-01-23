package day4;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

	public static void main(String[] args) {
		// find all pair with given sum(k)
		// given k>0
		int arr[]= {1,5,7,1};
		int k=6;
		int n=arr.length;
		
  int res = getPairsCount(arr,n,k);
  System.out.println(res);
	}
	
	static  int getPairsCount(int[] arr, int n, int k) {
	        // code here
	        Map<Integer,Integer> map = new HashMap<>();
	        int ans=0;
	        for(int i=0;i<n;i++){
	            int rs = k-arr[i];
	            if(rs<0)continue;
	            if(map.containsKey(rs)){
	                ans+=map.get(rs);
	            }
	            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	        }
	        return ans;
	    }

}
