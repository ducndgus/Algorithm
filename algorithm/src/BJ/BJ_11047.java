package BJ;
import java.util.*;

public class BJ_11047 {
	public static void main(String[] args) {
		int N,K;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		Stack<Integer> coin = new Stack<Integer>();
		
		for(int i =0; i<N; ++i) {
			coin.add(sc.nextInt());
		}
		int cnt=0;
		
		while(K!=0) {
			int tcoin=coin.pop();
			cnt+=K/tcoin;
			K-=(K/tcoin)*tcoin;
		}
		System.out.println(cnt);
	}
}
