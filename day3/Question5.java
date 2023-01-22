package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 {

	public static void main(String[] args) {
		 
		int nums[]= {1,3,5,4,2};
		
		nextPer(nums);
		System.out.println(Arrays.toString(nums));
      
	}
	
	static void nextPer(int nums[]) {
		 if(nums.length==1)return ;
	       int i= nums.length-2;
	        while(i>=0 &&  nums[i]>=nums[i+1])i--;

	        if(i>=0){
	            int j= nums.length-1;
	            while(j>=0 &&nums[j]<=nums[i])j--;
	            int temp= nums[i];
	            nums[i]=nums[j];
	            nums[j]=temp;
	        }
	        reverse(nums,i+1,nums.length-1);
	}
	
	static void reverse(int nums[],int i,int j) {
		  while(i<=j){
	            int temp=nums[i];
	            nums[i]=nums[j];
	            nums[j]=temp;
	            i++;j--;
	        }
	}

}
