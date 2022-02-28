package BJ;

import java.util.*;

public class BJ_1780 {
	static int[][] arr;
	static int ans1=0,ans2=0,ans3=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		arr=new int[N][N];
		for(int i=0; i<N; ++i) {
			for(int j=0; j<N; ++j) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		solve(0,0,N);
			
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);

	}
	
	public static void solve(int r,int c, int size) {
		//k는 몇개 도나 정하는 것?
		//시작점은 k/9개
		if(check(r,c,size)) {
			int num=arr[r][c];
			if(num==-1) ans1++;
			if(num==0) ans2++;
			if(num ==1) ans3++;
			return;
		}
		
		int newSize=size/3;
		for(int i=r; i<r+size; i+=newSize) {
			for(int j=c; j<c+size; j+=newSize) {
				solve(i,j,newSize);
			}
		}
		
	}
	
	
	public static boolean check(int r, int c, int size) {
		for(int i=r; i<r +size; i++) {
			for(int j=c; j<c+size; j++) {
				if(arr[r][c]!=arr[i][j]) return false;
			}
		}
		return true;
	}
}
