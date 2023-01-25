package day5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question4 {

	public static void main(String[] args) {
		// find longest consecutive sequence 
		
		int arr[]= {2,6,1,9,4,5,3};
		
		// brute force 
//		Arrays.sort(arr);
//		int pre= arr[0];
//		int ans=1;
//		int cur=1;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]==pre+1) {
//				ans++;
//			}else if(arr[i]!=pre) {
//				cur=1;
//			}
//			pre=arr[i];
//			ans=Math.max(ans,cur);
//		}
//		
//		System.out.println(ans);
		
		  Set<Integer> set = new HashSet<>();
		   for(int e:arr)set.add(e);
		   int res =0;
		   
		   for(int nums:arr){
		       if(!set.contains(nums-1)){
		           int cn =nums;
		           int cl =1;
		           while(set.contains(cn+1)){
		               cn++;
		               cl++;
		           }
		           res=Math.max(res,cl);
		       }
		   }
		   
		   System.out.println(res);

	}

}
