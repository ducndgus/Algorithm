package BJ;
import java.util.*;


public class BJ_1182 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int S=sc.nextInt();
		//부분집합 구하는 법? 2^n개의 부분집합 존재; 
		int[] arr = new int[20];
		Arrays.fill(arr, 0);
		int cnt=0;
		for(int i=0; i<N; ++i) {
			arr[i]=sc.nextInt();
		}
		
		for(int i =1; i<Math.pow(2, N); ++i) {
			int temp=i;
			int sum=0;
			for(int j=0; j<20; ++j) {
				sum+=arr[j]*(temp%2);
				temp/=2;
			}
			if(sum==S) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
