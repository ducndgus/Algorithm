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
		//정렬
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
		
		//0.5일때 구해야 하나? 최소 갯순데 최대로 겹치는거구해야함
		//최소인데 그냥 0.5 단위일 때 갯수 세면 되지않을까 싶음
		//이건 브루탈포스... 어떻게 하면 그리디로 풀까 최대로 욕심 부려간다.... 구하는건 최소..?
		//어렵당 강의실을 만들었다 지웠다 할당은 말이안되고 그렇다고 새로 만들었다 없엘수도 없고
		//강의실 번호 max로 저장해놓고 빈 강의실 없을 경우 새로운 강의실할당?
		//그리드 뜻은 제일 많은 할당치 가진거로 일단 채우고 하는것 이 문제에서 최대 할당치는 강의실 한개가 커버할 수 있는 가장 많은 수업 수?
		//그리드 전제가 배수 하나씩 할당
		//하나씩 소거법으로 간다?
		//일단 한개 해서 끝까지 돌고~ 그다음 남은거있음 하고~ 그다음 남은거? 나쁘지 않음
		//수업 0개남을 때까지 돌면 되는거아닌가
		//수업 N개 하나씩 할때마다 지우자
		int cnt=N;
		int ans=0;
		//check 배열 만들어서 해당 수업 돌았나 체크
		boolean[] check=new boolean[N];
		Arrays.fill(check, false);
		
		while(true) {
			if(cnt==0) {
				break;
			}
			
			
		}
		
	}
}
