package BJ;
import java.util.*;

public class BJ_2104 {
	
	static int arr[];
	public static void main(String[] args) {
		//���� �������� Ǯ�����
		//���ϴ� ���� �ּҰ�
		//�ּҰ��� ���� �� �� ���� �ִ밡 �Ǵ� �� �ؼ� ���ϳ�?
		//���� ������ �ص� �Ȱ����� Ȯ���ص� �Ȱ��ƾ� �Ѵ�.
		// ������ �ٿ�����?
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		arr=new int[N+1];
		for(int i=0; i<N; ++i) {
			arr[i]=sc.nextInt();
		}
		
		//�ݶ��ؼ� �غ���?
		
		System.out.println(cal(0,N-1));
	}
	
	public static long cal(int start, int end) {
		if(start==end) return arr[start]*arr[start];
		long ans=0;
		int mid=(start+end)/2;		
		//�ϴ� ���ʿ��� ���
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
