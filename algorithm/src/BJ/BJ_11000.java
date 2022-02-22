package BJ;
import java.util.*;

public class BJ_11000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		int[][] arr = new int[n][2];
	
		for(int i = 0 ; i<n; ++i) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		//정렬
		Arrays.sort(arr, new Comparator <int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				}
				return o1[0]-o2[0];
			}
		
		});
		// 배열의 첫 번째 end 값을 큐에 넣는다.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(arr[0][1]);
		
		for(int i=1; i<n; ++i) {
			if(pq.peek()<=arr[i][0]) pq.poll();
			pq.add(arr[i][1]);
		}
		
		System.out.println(pq.size());
		
	}
}
