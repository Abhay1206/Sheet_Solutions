package day4;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		// find elemnets present in all three
		int A[]= {1, 5, 10, 20, 40, 80};
		int B[]= {6, 7, 20, 80, 100};
		int C[]= {3, 4, 15, 20, 30, 70, 80, 120};
		
      ArrayList<Integer> al = commonElements(A,B,C,A.length,B.length,C.length);
      System.out.println(al);
	}
	
  static	ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer>al = new ArrayList<>();
        
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2&&k<n3){
            if(A[i]==B[j]&&C[k]==B[j]){
                if(!al.contains(A[i]))al.add(A[i]);
                i++;
                j++;
                k++;
            }else if((A[i]<=B[j])&&(A[i]<=C[k])){
                i++;
            }else if((B[j]<=A[i])&& (B[j]<=C[k])){
                j++;
            }else{
                k++;
            }
        }
        return al;
    }

}
