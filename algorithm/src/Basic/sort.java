package Basic;

import java.util.*;

public class sort {
	public static void main(String[] args) {
		
		//기본 타입 부분 정렬
		int arr3[]= {9,8,7,1,2,3};
		Arrays.sort(arr3,1,3); //index 1이상 3미만 > 미만에 주의하도록
		for(int i : arr3) {
			System.out.print(i);
		}
		System.out.println();
		
		//클래스타입 오름차순
		Integer arr[]= {9,8,7,1,2,3};
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		
		//클래스타입 내림차순
		Arrays.sort(arr,Collections.reverseOrder()); 
		for(int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		
		//클래스타입 내림차순
		String arr2[]= {"apple","ant","air"};
		Arrays.sort(arr2);
		for(String s : arr2) {
			System.out.print(s+' ');
		}
		System.out.println();
		
		//클래스타입 오름차순
		Arrays.sort(arr2, Collections.reverseOrder());
		for(String s : arr2) {
			System.out.print(s+' ');
		}
		
		//더 공부해야할거 comparator 잘 모름
		
	}
}
