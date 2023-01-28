package day7;

public class SmallestSubArrwithSummorethanX {

	public static void main(String[] args) {
		int a[]= {1,4,45,6,5,9};
		int n =a.length;
		int x =51;
		  int sum=0;
	       int ans=Integer.MAX_VALUE;
	       int left=0;
	       for(int i=0;i<a.length;i++){
	           sum+=a[i];
	           if(sum>x){
	           while(sum>x){
	               ans =Math.min(ans,i-left+1);
	               sum-=a[left];
	               left++;
	           }
	           }
	       }
System.out.println(ans);
	}

}
