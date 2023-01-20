package day1;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {152,155,568,471,457,214,369,128};
		
		// target = find min ad max in the given array;
		
		int max =Integer.MIN_VALUE;
		int min =Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
			if(arr[i]<min) {
				min =arr[i];
			}
		}
  System.out.println(max+" "+ min);
	}

}
