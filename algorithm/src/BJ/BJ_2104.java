package BJ;
import java.util.*;

public class BJ_2104 {
	static int ans=0;
	public static void main(String[] args) {
		//���� �������� Ǯ�����
		//���ϴ� ���� �ּҰ�
		//�ּҰ��� ���� �� �� ���� �ִ밡 �Ǵ� �� �ؼ� ���ϳ�?
		//���� ������ �ص� �Ȱ����� Ȯ���ص� �Ȱ��ƾ� �Ѵ�.
		// ������ �ٿ�����?
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n+1];
		for(int i=1; i<n+1; ++i) {
			arr[i]=sc.nextInt();
		}
		
		//�ݶ��ؼ� �غ���?
		cal(1,n+1);
		System.out.println(ans);
	}
	
	public static void cal(int start, int end) {
		int p=(start+end)/2;
		
	}
}
