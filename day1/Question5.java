package day1;

public class Question5 {

	public static void main(String[] args) {
		
		int arr[]= {4,-4,-9,7,5,6,-8};
		// dnf same as question 4
		int low=0;
		int high = arr.length-1;
		while(low<=high) {
			if(arr[low]<0) {
				low++;
			}else if(arr[high]>0) {
				high--;
			}else {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
       for(int e:arr) {
    	   System.out.println(e+" ");
       }
	}

}
