package BJ;
import java.util.*;

public class BJ_1725 {
	static int arr[];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		arr= new int[N];
		for(int i =0; i< N; ++i) {
			arr[i]=sc.nextInt();
		}
		System.out.println(cal(0,N-1));
	}
	
	public static int cal(int s, int e) {
		if(s==e) return arr[s];
		int ans=0;
		int mid= (s+e)/2;
		int l = mid;
		int r=mid+1;
		
		ans=Math.max(cal(s,mid),cal(mid+1,e));
		
		ans = Math.max(ans, Math.min(arr[l], arr[r])*2);
		int height= Math.min(arr[l],arr[r]);

		while(s<l ||r<e) {
			//r이 젤 우측이면 좌로 갈수밖에 없음, 높이가 왼쪽 오른쪽 중 높은 곳으로 가는 것이 맞음
			if(s<l&&(e==r||arr[l-1]>arr[r+1])) {
				--l;
				height=Math.min(height, arr[l]);
			}
			else {
				++r;
				height=Math.min(height, arr[r]);
			}
			ans=Math.max(ans,(r-l+1)*height);
		}
		
		return ans;
		
	}
}
