package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:�ö�ά�����ӡ���������
 * 
 *1.ÿһ�еĵ�һ��Ԫ��1�����һ��Ԫ��Ϊ1
 *2
 */
public class Demo19 {

	public static void main(String[] args) {
		//1.������ά����
		int[][] yangHui = new int[10][];
		//2.��ʼ��
		for(int i=0;i<yangHui.length;i++) {
			yangHui[i] = new int[i+1];
			//2.1��ĩԪ�ظ�ֵΪ1
			yangHui[i][0] = yangHui[i][i] = 1;
			//2.2����ĩ֮���Ԫ�ظ�ֵ
			for(int j=1;j<yangHui[i].length-1;j++) {
				yangHui[i][j] = yangHui[i-1][j] +yangHui[i-1][j-1];
			}
			
		}
		
		for(int i=0;i<yangHui.length;i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j]+" ");
			}
			System.out.println();
		}

	}

}
