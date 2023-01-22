package day3;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// find the only repeating number 
		
		int arr[]= {1,3,2,4,2};
		
		Set<Integer> set = new HashSet<>();
		for(int e:arr) {
			if(!set.contains(e)) {
				set.add(e);
			}else {
				System.out.println(e);
			}
		}
		
		// optimized approach
		
		int slow= arr[0];
		int fast =arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		
		fast =arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast =arr[fast];
		}
		System.out.println(slow);
	}

}
