package BJ;
import java.util.*;


public class BJ_1018 {
	public static void main(String[] args) {
		int N,M;
		Scanner sc= new Scanner(System.in);
		char[][] m= new char[50][50];
		N=sc.nextInt();
		M=sc.nextInt();
		int ans=Integer.MAX_VALUE;
		for(int i =0; i<N; ++i) {
			String temp = sc.next();
			for(int j=0; j<M; ++j) {
				m[i][j]=temp.charAt(j);
			}
		}
		
		for(int i =0; i<N-7; ++i) {
			for(int j = 0; j<M-7; ++j) {
				int cnt=0; 
				for(int k=i; k<i+8; ++k) {
					for(int l=j; l<j+8; ++l) {
						if((k+l)%2==0) {
							if(m[k][l]=='B') cnt++;
						}else if((k+l)%2==1){
							if(m[k][l]=='W') cnt++;
						}
					}
				}
				if(cnt >32) cnt=64-cnt;
				
				ans=Math.min(ans, cnt);
			}
		}
		System.out.println(ans);
	}
}
