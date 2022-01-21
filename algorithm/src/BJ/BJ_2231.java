package BJ;

import java.util.*;

public class BJ_2231 {
	
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		int ans=0;
		
		for(int i = 0; i<N; ++i) {
			int sum=i; 
			String s=Integer.toString(i);
			for(int j= 0; j<s.length(); ++j) {
				sum+=s.charAt(j)-'0';
			}
			if(sum==N) {
				ans=i;
				break;
			}
		}
		
		System.out.println(ans);
	}
}
