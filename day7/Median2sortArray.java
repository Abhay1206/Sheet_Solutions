package day7;

import java.util.Arrays;

public class Median2sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num1[]= {2,3};
           int nums2[]= {1,4};
           
           
	}
	
	  public double findMedianSorted(int[] nums1, int[] nums2) {
	         int arr[]= new int[nums1.length+nums2.length];
	       int i=0;
	       for(int num:nums1){
	           arr[i]=num;
	           i++;
	       }
	       for(int num:nums2){
	            arr[i]=num;
	            i++;
	        }
	        Arrays.sort(arr);
	       int len=arr.length;
	       int mid=len/2;
	       if(len%2==0){
	           return (arr[mid]+arr[mid-1])/2f;
	       }else {
	           return arr[mid];
	       }
	    }
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
            
       
       int n1= nums1.length;
       int n2=nums2.length;
       
       int l=0,h=n1;
       int pos=(n1+n2+1)/2;
       while(l<=h){
           int c1=(l+h)/2;
           int c2= pos-c1;
           
       int     l1=(c1==0)?Integer.MIN_VALUE:nums1[c1-1];
        int    l2=(c2==0)?Integer.MIN_VALUE:nums2[c2-1];
          int  r1=(c1==n1)?Integer.MAX_VALUE:nums1[c1];
           int r2=(c2==n2)?Integer.MAX_VALUE:nums2[c2];
           
           if(l1<=r2&&l2<=r1){
               if((n1+n2)%2==0){
                   return ((Math.max(l1,l2))+(Math.min(r1,r2)))/2.0;
               }else{
                   return Math.max(l1,l2);
               }
           } else if(l1>r2)h=c1-1;
           else l=c1+1;
           
           
           
       }
       return 0.0;
   }

}
