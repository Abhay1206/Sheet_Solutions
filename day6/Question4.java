package day6;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int heights[]= {0,1,0,2,1,0,1,3,2,1,2,1};
   System.out.println(trap(heights));
	}
	
	  public static int trap(int[] arr) {
	        int l=0,r=arr.length-1;
	        int l_max=0,r_max=0;
	        int res=0;
	        while(l<r){
	            
	            if(arr[l]<=arr[r]){
	                if(arr[l]>=l_max){
	                    l_max=arr[l];
	                }else res+=l_max-arr[l];
	                l++;
	                
	                
	            }else{ 
	                if(arr[r]>=r_max)r_max=arr[r];
	                else res+= r_max-arr[r];
	                r--;
	            }
	            
	            
	            
	        }
	        return res;
	        
	    }

}
