package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		// union of a and b
	  Set<Integer> set = new HashSet<>();
	  for(int e:a)set.add(e);
	  for(int e:b)set.add(e);
//	  System.out.println(set);
	  
	  // intersection of a and b;
	  Arrays.sort(a);
	  Arrays.sort(b);
   int i=0;
   int j=0;
   List<Integer> al = new ArrayList<>();
   while(i<n && j<m) {
	   if(a[i]==b[j]) {
		   al.add(a[i]);
		   i++;
		   j++;
	   }else if(a[i]>b[j]) {
		   j++;
	   }else {
		   i++;
	   }
   }
	  
	System.out.println(al);
		
	}
	
	
	

}
