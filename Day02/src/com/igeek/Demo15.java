package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:���������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
 */
public class Demo15 {

	public static void main(String[] args) {
		// ��������
		int[] arr = { 12, 98, 45, 73, 60 };
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(max +";" + min);
		

	}

}
