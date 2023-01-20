package day1;

public class Question1 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7};
		// target - reverse this array
		
		int n =arr.length;
		
//		for(int i=0;i<=n/2;i++) {
//			int temp= arr[i];
//			arr[i]=arr[n-1-i];
//			arr[n-i-1]=temp;
//		}
//		
		
		rev(0,arr.length-1,arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}
		

	}
  static void rev(int i,int j,int arr[]) {

	 if(i<j) {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
	 }else {
		 rev(i++,j--,arr);
	 }
	  
	
	  
  }
}
