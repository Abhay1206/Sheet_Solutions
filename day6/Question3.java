package day6;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		
	int	n = 6, X = 13;
			int 	arr[] = {1 ,4 ,45, 6, 10, 8};
					
//Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
System.out.println(find3Numbers(arr,n,X));
					
	}
	
	 public static boolean find3Numbers(int A[], int n, int X) { 
		    
	      if(n<3) return false;
	      Arrays.sort(A);
	      boolean res=false;
	      
	      for(int i=0;i<n-2;i++){
	          int tar = X-A[i];
	          int low=i+1;
	          int high=n-1;
	          while(low<high){
	              int cur =A[low]+A[high];
	              if(cur>tar){
	                  high--;
	              }else if(cur<tar){
	                  low++;
	              }else{
	                  res=true;
	                  break;
	              }
	          }
	          
	      }
	      return res;
	    
	    }

}
