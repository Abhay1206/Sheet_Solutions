package day2;

import java.util.Arrays;

public class Question4 {
	
	public static void main(String []args) {
	//	Minimize the Heights II
		
		int arr[]= {3,9,12,16,20};
		int n =arr.length;
		int k =3;
	     Arrays.sort(arr);
	       
	        int ans = arr[n-1]-arr[0];
	        for(int i=1;i<n;i++){
	          int   max = Math.max(arr[i-1]+k,arr[n-1]-k);
	             int min =Math.min(arr[0]+k,arr[i]-k);
	            if(min<0)continue;
	            ans =Math.min(ans,max-min);
	        }
	        System.out.println(ans);
	}

}
