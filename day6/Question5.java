package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
	//	1. Each student gets exactly one packet.
	//	2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> al  = new ArrayList<>();
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		System.out.println(al);
		System.out.println(findMinDiff(al,n,m));
	}
	
	 public static long findMinDiff (ArrayList<Integer> a, int n, int m)
	    {
	       Collections.sort(a);
	       int i=0;
	       int j =m-1;
	       int diff = Integer.MAX_VALUE;
	       while(j<a.size()){
	          
	           diff =Math.min(diff,a.get(j)-a.get(i));
	           i++;
	           j++;
	       }
	       return diff;
	    }

}
