package BJ;
import java.util.*;

public class BJ_11000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();

		int[][] c = new int[N][2];
		int M=0;
		for(int i = 0 ; i<N; ++i) {
			c[i][0]=sc.nextInt();
			c[i][1]=sc.nextInt();
			M=Math.max(M,c[i][1]);
		}
		//����
		Arrays.sort(c, new Comparator <int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}
		
		});
		
		//0.5�϶� ���ؾ� �ϳ�? �ּ� ������ �ִ�� ��ġ�°ű��ؾ���
		//�ּ��ε� �׳� 0.5 ������ �� ���� ���� ���������� ����
		//�̰� ���Ż����... ��� �ϸ� �׸���� Ǯ�� �ִ�� ��� �η�����.... ���ϴ°� �ּ�..?
		//��ƴ� ���ǽ��� ������� ������ �Ҵ��� ���̾ȵǰ� �׷��ٰ� ���� ������� �������� ����
		//���ǽ� ��ȣ max�� �����س��� �� ���ǽ� ���� ��� ���ο� ���ǽ��Ҵ�?
		//�׸��� ���� ���� ���� �Ҵ�ġ �����ŷ� �ϴ� ä��� �ϴ°� �� �������� �ִ� �Ҵ�ġ�� ���ǽ� �Ѱ��� Ŀ���� �� �ִ� ���� ���� ���� ��?
		//�׸��� ������ ��� �ϳ��� �Ҵ�
		//�ϳ��� �ҰŹ����� ����?
		//�ϴ� �Ѱ� �ؼ� ������ ����~ �״��� ���������� �ϰ�~ �״��� ������? ������ ����
		//���� 0������ ������ ���� �Ǵ°žƴѰ�
		//���� N�� �ϳ��� �Ҷ����� ������
		int cnt=N;
		int ans=0;
		//check �迭 ���� �ش� ���� ���ҳ� üũ
		boolean[] check=new boolean[N];
		Arrays.fill(check, false);
		
		while(true) {
			if(cnt==0) {
				break;
			}
			
			
		}
		
	}
}
