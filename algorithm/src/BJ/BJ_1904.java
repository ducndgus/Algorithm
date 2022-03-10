package BJ;

import java.util.*;

public class BJ_1904 {
	public static void main(String[] args) {
		// 1, 00
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		long dp[]= new long[N+10];
		Arrays.fill(dp, 0);
		dp[1]=1;
		dp[2]=2;
		//N-2에서 00붙이기 
		//N-1에서 1붙이기
		for(int i=3; i<=N;++i) {
			dp[i]=(dp[i-2]+dp[i-1])%15746;
		}
	
		System.out.println(dp[N]);
	}
}
