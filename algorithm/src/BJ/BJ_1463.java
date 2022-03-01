package BJ;
import java.util.*;

public class BJ_1463 {
	static int dp[];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int X=sc.nextInt();
		dp=new int[X+1];
		Arrays.fill(dp, -1);
		solve(X);
		System.out.println(dp[X]);
	}
	
	public static int  solve(int n) {
		if(n<=1) return 0;
		if(dp[n]!=-1) return dp[n];
		int result= solve(n-1)+1;
		if(n%3==0) result=Math.min(result, solve(n/3)+1);
		if(n%2==0) result=Math.min(result, solve(n/2)+1);
		dp[n]=result;
		return result;
	}
}
