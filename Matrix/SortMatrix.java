package Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrix {

	public static void main(String[] args) {
		
		int arr[][]= { {1,5,3},{9,6,4},{2,8,7} };
		
		List<Integer> l = new ArrayList<>();
		for(int a[]:arr) {
			for(int e:a)l.add(e);
		}
		Collections.sort(l);
		System.out.println(l);
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=l.get(k++);
			}
		}
  for(int a[]:arr) {
	  for(int e:a) {
		  System.out.print(e+" ");
	  }
	  System.out.println();
  }
	}

}
