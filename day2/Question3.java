package day2;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// largest contigious sum subarray
		
		int arr[]= {-78,54,84,-12,36};
		int n =arr.length;
		
		int res = sum(arr,n);
   System.out.println(res);
	}

	private static int sum(int[] arr, int n) {
		 int cs =0;
	        int ms =Integer.MIN_VALUE;;
	        
	        for(int i=0;i<n;i++){
	            cs =cs+arr[i];
	            if(cs>ms){
	                ms=cs;
	            }
	            if(cs<0){
	                cs=0;
	            }
	        }
		return ms;
	}

}
