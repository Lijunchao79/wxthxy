package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:��ά����
 * �����ʽ
	��������[][] ������;
	�������� ������[][]; ���Ƽ�
	��������[] ������[]; ���Ƽ�
	��ʼ����ʽ
	��������[][] ������ = new ��������[m][n];
	��������[][] ������ = new ��������[][]{{Ԫ�ء�},{Ԫ�ء�},{Ԫ�ء�}};
	�򻯰��ʽ����������[][] ������ = {{Ԫ�ء�},{Ԫ�ء�},{Ԫ�ء�}};
 */
public class Demo17 {

	public static void main(String[] args) {
		int[][] arr;
		int arr1[][];
		int[] arr2[];//�˽�
		
		int[][] arr3 = new int[3][];
		int[][] arr4 = new int[][] {{1,2},{},{}};
		
		//��д
		int[][] arr5 = {{1,2},{2,3},{3,4}};
		System.out.println(arr5[0][0]);
		System.out.println(arr5[0][1]);
		System.out.println(arr5[1][0]);
		System.out.println(arr5[1][1]);
		System.out.println("**********************");
		System.out.println(arr5.length);
		System.out.println(arr5[0].length);
		System.out.println("**********************");
		//����
		int[] temp = arr5[0];
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("**********************");
		//��ά����ı���
		for(int i=0;i<arr5.length;i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		for (int[] temp2 : arr5) {
			for (int i : temp2) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
