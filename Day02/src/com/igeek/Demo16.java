package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description: ð������
 */
public class Demo16 {
	
	public static void main(String[] args) {
		
		int[] arr = { 12, 98, 45, 73, 60 };
		bubbleSort(arr);
	}
	/**
	 *1  �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
	 *2	��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԣ�����������Ԫ��Ӧ�û�����������
	 *3	������е�Ԫ���ظ����ϵĲ��裬�������һ����
	 *4	�ظ�����1~3��ֱ��������ɡ�
	 */
	public static void bubbleSort(int[] arr) {
		//������
		for(int i=0;i<arr.length-1;i++) {
			//��ѭ��
			for(int j=0;j<arr.length-1-i;j++) {
				//�Ƚ����ڵ�Ԫ��
				if(arr[j]>arr[j+1]) {
					//����
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	

}
