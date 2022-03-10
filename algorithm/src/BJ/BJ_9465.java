package BJ;
import java.util.*;

public class BJ_9465 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0; i<k; ++i) {
			int n= sc.nextInt();
			int arr[][]=new int[n][2];
			
			for(int j=0; j< 2; ++j) {
				for(int l=0;l<n; ++l) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			
		}
		
	}
}
