package BJ;
import java.util.*;

public class BJ_2503 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		//N 3�ڸ� ��, ����� �� 3�ڸ�
		//��� ���� �� ù�ڸ� ���� ��, �ι�° �ڸ� ���� �� , ����° �ڸ� ���� ��??
		int ans[] = new int[1000];
		Arrays.fill(ans,1);//���� = 1
		int cnt=0;
		for(int i =0 ; i<N; ++i) {
			int n =sc.nextInt();
			int s = sc.nextInt();
			int b = sc.nextInt();
			
			int n1=Integer.toString(n).charAt(0)-'0';
			int n2=Integer.toString(n).charAt(1)-'0';
			int n3=Integer.toString(n).charAt(2)-'0';
			
			for(int j=100; j<1000;++j) {
				int j1=Integer.toString(j).charAt(0)-'0';
				int j2=Integer.toString(j).charAt(1)-'0';
				int j3=Integer.toString(j).charAt(2)-'0';
				if(j1==j2 || j2==j3 || j3==j1 ||j1==0||j2==0||j3==0) {
					ans[j]=0;
				}
				//��Ʈ����ũ ���
				int ts=0;
				if(n1==j1) ts++;
				if(n2==j2) ts++;
				if(n3==j3) ts++;
				// ball ���
				int tb=0; 
				if(n1==j2) tb++;
				if(n1==j3) tb++;
				if(n2==j1) tb++;
				if(n2==j3) tb++;
				if(n3==j1) tb++;
				if(n3==j2) tb++;
				
				if(s!=ts|| b!=tb) {
					ans[j]=0;
				}
			}
		}
		for(int i=100; i< 1000; ++i) {
			if(ans[i]==1) cnt++;
		}
		System.out.println(cnt);
	}
}
