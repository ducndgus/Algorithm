package BJ;
import java.util.*;

public class BJ_2193 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		//이친수
		//0으로 시작하지 않음
		//1이 두 번 연속 나타나지 않음
		long dp[][]=new long[N+10][2];
		dp[1][1]=1;
		dp[1][0]=0;
		dp[2][0]=1;
		dp[2][1]=0;
		for(int i=2;i<N; ++i) {
			//0이 붙을때 0으로 끝나는거 + 1로 끝나는거
			dp[i+1][0]=dp[i][0]+dp[i][1];
			//1이 붙을 때
			dp[i+1][1]=dp[i][0];
		}
		System.out.println(dp[N][0]+dp[N][1]);
	}
}
