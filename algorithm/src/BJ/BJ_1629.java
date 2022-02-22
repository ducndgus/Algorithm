package BJ;
import java.util.*;

public class BJ_1629 {
	static long A;
	static long B;
	static long C;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		
		System.out.println(mul(B));
	}
	
	public static long mul(long i) {		
		if(i==0) return 1;
		long tmp= mul(i/2);
		long result=(tmp*tmp)%C;
		if(i%2==1) return (result * A)%C;
		return result;
	}
	
}
