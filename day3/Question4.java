package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		
		// merge the overlapping intervals;
		
		int res [][]= find(intervals);
		
		for(int arr[]:res) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	static int[][] find(int[][]intervals){
		  if(intervals.length<=1){
	            return intervals;
	        }
	        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
	        
	        List<int[]> ans = new ArrayList<>();
	        int curr[]= intervals[0];
	        ans.add(curr);
	        for(int [] its:intervals){
	            int cb=curr[0];
	            int ce=curr[1];
	            int nb=its[0];
	            int ne=its[1];
	            if(ce>=nb){
	                curr[1]=Math.max(ce,ne);
	            }else{
	                curr=its;
	                ans.add(curr);
	            }
	        }
	        
	       
	        
	        
	         return ans.toArray(new int[ans.size()][]);
	}

}
