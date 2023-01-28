package day7;

import java.util.Arrays;

public class ThreeWayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,4,5,9,0};
		int a =1;
		int b=2;
		  int low=0;
	      int mid=0;
	      int high = arr.length-1;
	      
	      while(mid<=high){
	          if(arr[mid]<a){
	              int temp=arr[mid];
	              arr[mid]=arr[low];
	              arr[low]=temp;
	              mid++;
	              low++;
	              
	          }else if(arr[mid]>b){
	              int temp=arr[mid];
	              arr[mid]=arr[high];
	              arr[high]=temp;
	              high--;
	          }else{
	              mid++;
	          }
	      }
	      System.out.println(Arrays.toString(arr));

	}

}
