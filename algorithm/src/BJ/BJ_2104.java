package BJ;
import java.util.*;

public class BJ_2104 {
	
	static int arr[];
	public static void main(String[] args) {
		//분할 정복으로 풀어야함
		//곱하는 수는 최소값
		//최소값을 갖는 것 중 합이 최대가 되는 것 해서 구하나?
		//작은 범위로 해도 똑같은데 확대해도 똑같아야 한다.
		// 범위를 줄여볼까?
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		arr=new int[N+1];
		for(int i=0; i<N; ++i) {
			arr[i]=sc.nextInt();
		}
		
		//반띵해서 해볼까?
		
		System.out.println(cal(0,N-1));
	}
	
	public static long cal(int start, int end) {
		if(start==end) return arr[start]*arr[start];
		long ans=0;
		int mid=(start+end)/2;		
		//일단 왼쪽에서 계산
		ans=Math.max( cal(mid+1,end), cal(start,mid));
		
		int l=mid;
		int r=mid+1;
		int base= arr[l]+arr[r];
		int height=Math.min(arr[l],arr[r]);
		ans=Math.max(ans,base*height);
		
		while(!(l==start&&r==end)) {
			if(r<end &&(l==start||arr[l-1]<arr[r+1])){
				base+=arr[++r];
				height = Math.min(height,arr[r]);
			}
			else {
				base+=arr[--l];
				height = Math.min(height,arr[l]);
			}
			ans=Math.max(ans, base*height);
		}	
		return ans;
	}
}
