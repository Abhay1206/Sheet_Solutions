package day4;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,-1,4,-4,3};
		// output = {-1,1,-4,2,4,3}   
		// input ={1,-2,-4,-6,5} -> {1,-2,5,-4,-6};
		
		int nn=0;int pn=0;
		for(int e:arr) {
			if(e<0)nn++;
			if(e>0) pn++;
		}
		
		if(nn<pn) {
			solve(arr,nn,pn);
		}else {
			solveP(arr,nn,pn);
		}
  System.out.println(Arrays.toString(arr));
	}
	
	static void solve(int  arr[],int nn,int pn) {
		
		Arrays.sort(arr);
		
		int fpi=nn;
		for(int i=0;i<nn;i++) {
			if(i%2==0 && arr[i]<0) {
				continue;
			}
			int temp=arr[i];
			arr[i]=arr[fpi];
			arr[fpi]=temp;
			fpi++;
		}
		
	}
	
	static void solveP(int arr[],int nn,int pn) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		int fni=pn;
		
		for(int i=0;i<pn;i++) {
			if(i%2==0 && arr[i]>0) {
				continue;
			}
			int temp=arr[i];
			arr[i]=arr[fni];
			arr[fni]=temp;
			fni++;
		}
		
	}

}
