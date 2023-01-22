package day3;

import java.util.Arrays;

public class Queston2 {

	public static void main(String[] args) {
		// merge two sorted array without extra space(to accommodate all elements one of the array size will be greater.
		// solve leetcode 88 to get better idea
		
		int nums1[]= {1,2,3,0,0,0};
		int m=3 ;
		int nums2[]= {2,5,6};
		int n =3;
		 int i = m - 1, j = n - 1, k = m + n - 1;
	        while(i >= 0 && j >= 0) {
	            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
	        }
	        while(j >= 0) {
	            nums1[k--] = nums2[j--];
	        }
	        System.out.println(Arrays.toString(nums1));

	}

}
