package Matrix;

public class Rowwithmax1 {

	public static void main(String[] args) {
		
		int arr[][]= { {0,1,1,1}, {1,1,1,1},{0,0,0,1},{0,0,1,1}};
		
		int ans=0;
		int mc=0;
		for(int i=0;i<arr.length;i++) {
			int cc=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==1)cc++;
			}
			if(cc>mc) {
				mc=cc;
				ans=i;
			}
		}
System.out.println(ans);
	}

}
