package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:������������
 *  * ����
 * 		��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 * 		�������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣� 
 *  ��1��:1
 *  ��2��:1
 *  ��3��:1(��) 1 = 2
 *  ��4��:1(��) 1 1 = 3
 *  ��5��:1(��) 1(��) 1 1 1 = 5
 *  ��6��:1 1 1 1 1 1 1 1= 8
 *  .....
 */
public class Demo28 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<arr.length;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[19]);
	}

}
