package day2;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rotate array by k times;
		int k=4;
		int arr[]= {1,2,3,4,5,6,7,8};
		reverse(0,arr.length-1,arr);
		reverse(0,k-1,arr);
		reverse(k,arr.length-1,arr);
		
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int i, int j, int[] arr) {
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
