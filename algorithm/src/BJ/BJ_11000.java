package BJ;
import java.util.*;

public class BJ_11000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		
		int[][] c = new int[N][2];
		
		for(int i = 0 ; i<N; ++i) {
			c[i][0]=sc.nextInt();
			c[i][1]= sc.nextInt();
		}
		
		Arrays.sort(c, new Comparator <int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
		
		});
		
		
	}
}
