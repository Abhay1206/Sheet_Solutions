package day2;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[]= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		  
		  int res =find(arr);
		  System.out.println(res);
	}
  static int find(int arr[]) {
	  int n =arr.length;
      if(arr[0]==0 && n>1)return -1;
      if(n==1)return 0;
      int maxi=0;
      int cur=0;
      int step=0;
      for(int i=0;i<n-1;i++){
          maxi =Math.max(maxi,arr[i]+i);
          if(i==cur){
              step++;
              cur=maxi;
          }
      }
      if(cur<n-1)return -1;
      return step;
  }
}
