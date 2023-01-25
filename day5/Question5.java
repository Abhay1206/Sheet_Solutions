package day5;

import java.util.HashMap;
import java.util.Map;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		// print all elements greater than k
		
		int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
		int k=4;
		int n =arr.length;
		Map<Integer,Integer> map = new HashMap<>();
		for(int a:arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
System.out.println(map);

for(int key:map.keySet()) {
	if(map.get(key)>(n/k)) {
		System.out.println(key);
	}
}
	}

}
