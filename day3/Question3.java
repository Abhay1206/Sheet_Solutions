package day3;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // kadanes algo
		
		int arr[]= {};
		long res = kadane(arr,arr.length);
		System.out.println(res);
	}
	static long kadane(int arr[],int n) {
		 long cs =0;
	        long ms =Integer.MIN_VALUE;;
	        
	        for(int i=0;i<n;i++){
	            cs =cs+arr[i];
	            if(cs>ms){
	                ms=cs;
	            }
	            if(cs<0){
	                cs=0;
	            }
	        }
	   //   if(ms==0) return -1;
	        return ms;
	}

}
