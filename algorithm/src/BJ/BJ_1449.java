package BJ;
import java.util.*;

public class BJ_1449 {
	public static void main(String[] args) {
		//��ġ �¿� 0.5 +
		//������ ���� L �ּҰ��� ���� X ������ ��ġ�� X
		//�� ���� �� ���� N, ������ ���� L
		//�� ���� �� ��ġ
		Scanner sc= new Scanner(System.in);
		int N,L;
		N=sc.nextInt();
		L=sc.nextInt();
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		int cnt=0;
		double start=0;
		double end=0;
		
		for(int i =0; i<N; ++i) {
			pq.add(sc.nextDouble());
		}
		
		for(int i=0; i<N; ++i) {
			double temp=pq.element();
			pq.remove();
			if(end<=temp-0.5) {
				start= temp-0.5;
				end=start+L;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
