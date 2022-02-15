package BJ;
import java.util.*;


public class BJ_4796 {
	public static void main(String[] args) {
		//연속 P일, L일 사용가능, 휴가 V일
		Scanner sc= new Scanner(System.in);
		Queue<Integer> ans = new LinkedList();
		
		while(true) {			
			int L=sc.nextInt();
			int P=sc.nextInt();
			int V=sc.nextInt();
			if(L==0&&P==0&&V==0) break;
			int tans=(V/P)*L+Math.min((V-(V/P)*P),L);
			ans.add(tans);		
		}
		int cnt=1;
		while(!ans.isEmpty()) {
			System.out.println("Case "+cnt+": "+ans.element());
			ans.remove();
			cnt++;
		}	
	}
}
