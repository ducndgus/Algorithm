package Basic;

import java.util.*;

public class sort {
	public static void main(String[] args) {
		
		//�⺻ Ÿ�� �κ� ����
		int arr3[]= {9,8,7,1,2,3};
		Arrays.sort(arr3,1,3); //index 1�̻� 3�̸� > �̸��� �����ϵ���
		for(int i : arr3) {
			System.out.print(i);
		}
		System.out.println();
		
		//Ŭ����Ÿ�� ��������
		Integer arr[]= {9,8,7,1,2,3};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		
		//Ŭ����Ÿ�� ��������
		Arrays.sort(arr,Collections.reverseOrder()); 
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		
		//Ŭ����Ÿ�� ��������
		String arr2[]= {"apple","ant","air"};
		Arrays.sort(arr2);
		for(String s : arr2) {
			System.out.print(s+' ');
		}
		System.out.println();
		
		//Ŭ����Ÿ�� ��������
		Arrays.sort(arr2, Collections.reverseOrder());
		for(String s : arr2) {
			System.out.print(s+' ');
		}
		
		//�� �����ؾ��Ұ� comparator �� ��
		
	}
}
