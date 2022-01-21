package BJ;
import java.util.*;

public class BJ_2309 {
	
	static Integer arr[]= {0,0,0,0,0,0,0,0};
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		
		for(int i=0; i<arr.length; ++i) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		Arrays.sort(arr);

		int find = sum-100;
		// 2개 골라서 더하면 find 나와야함
		int a =0;
		int b= 0;
		for(int i=0; i<arr.length; ++i) {
			for(int j=i+1; j<arr.length; ++j) {
				if((i!=j) && (find == arr[i] + arr[j])) {
					a= arr[i];
					b= arr[j];
					break;
				}
			}
		}

		for(int i : arr) {
			if((i != a) && (i!= b)) {
				System.out.println(i);
			}			
		}
		
	}
}
