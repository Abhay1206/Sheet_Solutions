package day4;

import java.util.Arrays;

public class Question1 {
    static long res=0;
	public static void main(String[] args) {
		long arr[]= {2,4,1,3,5};
		
		// count inversion( for i< j ,arr[i]>arr[j];
		mergeSort(arr);
		System.out.println(res);
		

	}
	
	  static  long[]mergeSort(long[]arr){
	        if(arr.length==1)return arr;
	        int mid =arr.length/2;
	      long[] l =  mergeSort(Arrays.copyOfRange(arr,0,mid));
	      long[] r=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
	      return merge(l,r);
	    }
	  
	  static long[] merge(long[]l,long[]r){
	        long mix[]=new long[l.length+r.length];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<l.length && j< r.length){
	            if(l[i]<=r[j]){
	                mix[k]=l[i];
	                i++;
	                k++;
	            }else{
	                 res+=(l.length-i);
	                mix[k]=r[j];
	                k++;
	                j++;
	               
	            }
	        }
	        while(i<l.length){
	            mix[k]=l[i];
	            k++;
	        i++;
	        }
	        while(j<r.length){
	            mix[k]=r[j];
	            k++;
	            j++;
	        }
	        return mix;
	    }

}
