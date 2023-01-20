package day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Question3 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		
		int arr[]= {10,52,55,98,45,75,15};
		// target - find kth largest element and smallest element
		
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-k]);
//		System.out.println(arr[k-1]);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int e:arr) {
			pq.offer(e);
			while(pq.size()>k) {
				pq.poll();
			}
		}
		System.out.println(pq.peek());
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		for(int e:arr) {
			pq2.offer(e);
			while(pq2.size()>k) {
				pq2.poll();
			}
		}
		System.out.println(pq2.peek());
	}
}
