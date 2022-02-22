package BJ;
import java.util.*;
//////20220221 너무 어렵다 나중에 다시 도전

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
		//현재 제품 갯수
		int tcnt=0;
		
		for(int i=0; i<k; ++i) {
			int t=arr[i];
			boolean flag=false;
			//다 채워졌을 때 새로운거 등장시 빼야한다.
			if(tcnt==n) {				
				if(tap[t] == true) {
					count[t]--;
				}else {
					//count 에서 가장 적은 갯수 남은거 찾아 뺸다
					int tcount=0; 
					for(int j=1; j<101; ++j) {
						
					}
				}
			//비워져 있을 때 새로운거 뺄 필요 없음
			}else{
				count[t]--;
				tcnt++;
			}
		}
		System.out.println(ans);
	}
}
