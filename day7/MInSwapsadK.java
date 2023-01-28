package day7;

public class MInSwapsadK {

	public static void main(String[] args) {
		
		
	int	arr[] = {2, 1, 5, 6, 3}; 
		int K = 3;
		System.out.println(minSwap(arr,arr.length,K));

	}
	  public static int minSwap (int arr[], int n, int k) {
	     
	        int rn =0;
	        for(int e:arr){
	            if(e<=k)rn++;
	        }
	        
	        int nrn=0;
	        for(int i=0;i<rn;i++){
	            if(arr[i]>k)nrn++;
	        }
	        
	        int s=0;
	        int e=rn-1;
	        int ans=Integer.MAX_VALUE;
	        while(e<n){
	            ans=Math.min(ans,nrn);
	            e++;
	            if(e<n){
	               
	                if(arr[e]>k)nrn++;
	            }
	            if(s<n){
	                if(arr[s]>k)nrn--;
	                s++;
	            }
	        }
	        return ans;
	    }
	    
}
