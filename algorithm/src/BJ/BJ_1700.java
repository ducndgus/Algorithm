package BJ;
import java.util.*;
//////20220221 �ʹ� ��ƴ� ���߿� �ٽ� ����

public class BJ_1700 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[k];
		boolean tap[]=new boolean[101];
		int count[]=new int[101];
		int ans=0;
		
		Arrays.fill(tap, false);
		Arrays.fill(count, 0);
		for(int i=0; i<k; ++i) {
			arr[i]=sc.nextInt();
			count[arr[i]]++;
		}
		//���� ��ǰ ����
		int tcnt=0;
		
		for(int i=0; i<k; ++i) {
			int t=arr[i];
			boolean flag=false;
			//�� ä������ �� ���ο�� ����� �����Ѵ�.
			if(tcnt==n) {				
				if(tap[t] == true) {
					count[t]--;
				}else {
					//count ���� ���� ���� ���� ������ ã�� �A��
					int tcount=0; 
					for(int j=1; j<101; ++j) {
						
					}
				}
			//����� ���� �� ���ο�� �� �ʿ� ����
			}else{
				count[t]--;
				tcnt++;
			}
		}
		System.out.println(ans);
	}
}
