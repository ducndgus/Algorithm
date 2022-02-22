package BJ;
import java.util.*;

public class BJ_2104 {
	static int ans=0;
	public static void main(String[] args) {
		//분할 정복으로 풀어야함
		//곱하는 수는 최소값
		//최소값을 갖는 것 중 합이 최대가 되는 것 해서 구하나?
		//작은 범위로 해도 똑같은데 확대해도 똑같아야 한다.
		// 범위를 줄여볼까?
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n+1];
		for(int i=1; i<n+1; ++i) {
			arr[i]=sc.nextInt();
		}
		
		//반띵해서 해볼까?
		cal(1,n+1);
		System.out.println(ans);
	}
	
	public static void cal(int start, int end) {
		int p=(start+end)/2;
		
	}
}
