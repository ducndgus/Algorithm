package BJ;
import java.util.*;

public class BJ_1449 {
	public static void main(String[] args) {
		//위치 좌우 0.5 +
		//테이프 길이 L 최소갯수 컷팅 X 테이프 겹치기 X
		//물 새는 곳 개수 N, 테이프 길이 L
		//물 새는 곳 위치
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
