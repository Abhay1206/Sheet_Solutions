package Matrix;

import java.util.ArrayList;

public class SpiralTraver {

	public static void main(String[] args) {
	int	arr[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}};
	int r=arr.length;
	int c=arr[0].length;
	 
	System.out.println(spirallyTraverse(arr,r,c));
	

	}
	
	 static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
	    {
	        // code here 
	        
	        int rb =0;
	        int cb=0;
	        int re=r-1;
	        int ce=c-1;
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        while(rb<=re && cb<=ce){
	            for(int i=cb;i<=ce;i++){
	                list.add(arr[rb][i]);
	            }
	            rb++;
	            for(int i=rb;i<=re;i++){
	                list.add(arr[i][ce]);
	            }
	            ce--;
	        
	        
	       
				if(rb<=re) {
					for(int i=ce;i>=cb;i--) {
						list.add(arr[re][i]);
					}
					re--;
				}
				
				if(cb<=ce) {
					for(int i=re;i>=rb;i--) {
						list.add(arr[i][cb]);
					}
					cb++;
				}
	        }
	        return list;
	    }

}
