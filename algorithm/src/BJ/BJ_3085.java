package BJ;
import java.util.*;


public class BJ_3085 {
	public static void main(String[] args) {
		int N;
		char[][] m = new char[50][50];
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		for(int i = 0; i<N; ++i) {
			String temp=sc.next();
			for(int j=0; j<N; ++j) {
				m[i][j]=temp.charAt(j);
			}
		}
		
		int ans=1; 
		//������ �� ĭ  ������, �Ʒ� N-1����
		for(int i=0; i<N; ++i) {
			for(int j=0; j<N; ++j) {
				//�����ʰŶ� �ٲٱ�
				if(j!=N-1) {
					char temp1=m[i][j];
					m[i][j]=m[i][j+1];
					m[i][j+1]=temp1;
					/*
					for(int k =0; k< N; ++k) {
						for(int l=0; l<N; ++l) {
							System.out.print(m[k][l]);
						}
						System.out.println();
					}
					*/
					//����
					for(int k=0; k<N;k++) {
						int cnt=1;
						for(int l =0; l<N-1; ++l) {
							if(m[k][l]==m[k][l+1]) {
								cnt++;
								ans= Math.max(ans, cnt);
								//System.out.println(cnt);
							}else {
								cnt=1;
							}
						}
					}
					//�� �Ի�
					for(int l = 0; l<N; l++) {
						int cnt=1;
						for(int k = 0; k<N-1; ++k) {
							if(m[k][l]==m[k+1][l]) {
								cnt++;
								ans= Math.max(ans, cnt);
								//System.out.println(cnt);
							}else {
								cnt=1;
							}
						}
					}
					
					//����
					temp1=m[i][j];
					m[i][j]=m[i][j+1];
					m[i][j+1]=temp1;
				}
				
				if(i!=N-1) {
					//�Ʒ��� �ٲٱ�
					char temp2=m[i][j];
					m[i][j]=m[i+1][j];
					m[i+1][j]=temp2;
					/*
					for(int k =0; k< N; ++k) {
						for(int l=0; l<N; ++l) {
							System.out.print(m[k][l]);
						}
						System.out.println();
					}
					*/
					//����
					for(int k=0; k<N;k++) {
						int cnt=1;
						for(int l =0; l<N-1; ++l) {
							if(m[k][l]==m[k][l+1]) {
								cnt++;
								ans= Math.max(ans, cnt);
								//System.out.println(cnt);
							}else {
								cnt=1;
							}
						}
					}
					//�� �Ի�
					for(int l = 0; l<N; l++) {
						int cnt=1;
						for(int k = 0; k<N-1; ++k) {
							if(m[k][l]==m[k+1][l]) {
								cnt++;
								ans= Math.max(ans, cnt);
								//System.out.println(cnt);
							}else {
								cnt=1;
							}
						}
					}
					//����
					//�Ʒ��� �ٲٱ�
					temp2=m[i][j];
					m[i][j]=m[i+1][j];
					m[i+1][j]=temp2;
				}
				
				
			}
		}
		System.out.println(ans);
	}
}
