package BJ;
import java.util.* ;

public class BJ_10448 {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N= sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i =0; i<N; ++i) {
			int k = sc.nextInt();
			//3개의 삼각수로 구성 유무
			//Tn= n(n+1)/2 for문 3개?'
			int ans=0; 
			for(int n1=1; n1<Math.sqrt(2*k); ++n1) {
				for(int n2=1; n2<Math.sqrt(2*k); ++n2) {
					for(int n3=1; n3<Math.sqrt(2*k); ++n3) {
						if(n1*(n1+1)+n2*(n2+1)+n3*(n3+1)==2*k) {
							ans=1;
						}
					}
				}
			}
			q.add(ans);
		}
		while(!q.isEmpty()) {
			System.out.println(q.element());
			q.remove();
		}
	}
}
