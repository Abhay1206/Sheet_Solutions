package Matrix;

public class MedianinRowwiseSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r =3;
		int c =3;
		int M[][] = {{1, 3, 5}, 
		         {2, 6, 9}, 
		         {3, 6, 9}};
		
		System.out.println(median(M,r,c));
		

	}
	
	static  int median(int matrix[][], int r, int c) {
	       int min=Integer.MAX_VALUE;
	       int max=Integer.MIN_VALUE;
	       
	       for(int i=0;i<r;i++){
	           if(matrix[i][0]<min){
	               min=matrix[i][0];
	           }
	           if(matrix[i][c-1]>max){
	               max=matrix[i][c-1];
	           }
	       }
	       
	       int req_num=(r*c+1)/2;
	       while(max>min){
	           int mid=(max+min)/2;
	           int count=countLessOrEqual(matrix,r,c,mid);
	           
	           if(count<req_num){
	               min=mid+1;
	           }else{
	               max=mid;
	           }
	       }
	       
	       return min;
	       }
	       
	       
	    static   int countLessOrEqual(int[][]matrix,int r,int c,int tar){
	           int ans=0;
	           for(int i=0;i<r;i++){
	               int low=0;
	               int high=c-1;
	               while(low<=high){
	                   int mid=(low+high)/2;
	                   if(matrix[i][mid]<=tar){
	                       low=mid+1;
	                   }else{
	                       high=mid-1;
	                   }
	               }
	               ans+=low;
	           }
	           return ans;
	       }

}
