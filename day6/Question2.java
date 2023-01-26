package day6;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a1[] = {11, 1, 13, 21, 3, 7};
		long a2[] = {11, 3, 7, 1};
		
		// check whether a2 is subset of a1 or not;
		
		System.out.println(isSubset(a1,a2,a1.length,a2.length));
	}
	 public static String isSubset( long a1[], long a2[], long n, long m) {
	        
	        if(m>n)return "No";
	        
	        String res="";
	        
	        ArrayList<Long> set = new ArrayList<>();
	        for(long e:a1)set.add(e);
	        
	        for(long e:a2){
	            if(!set.contains(e)){
	               return "No";
	            }else{
	                set.remove(Long.valueOf(e));
	            }
	        }
	        return "Yes";
	    }
}
