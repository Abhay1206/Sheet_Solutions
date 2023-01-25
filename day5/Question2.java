package day5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n =101;
		  java.math.BigInteger B
	         = new java.math.BigInteger(n+"");

	     
	     for (int i = 1; i < n; i++)
	         B = B.multiply(new java.math.BigInteger(i+""));
	     String s= String.valueOf(B);
	      ArrayList<Integer> al = new ArrayList<>();
	      for(int i=0;i<s.length();i++){
	          
	          al.add(s.charAt(i)-'0');
	      }
	    System.out.println(al);
   
	}

}
