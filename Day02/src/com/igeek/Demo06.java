package com.igeek;

/**
 * �����ڿ���̨������еġ�ˮ�ɻ�����
 * 
 * ������
 * 		ʲô��ˮ�ɻ�����?
 * 			��ν��ˮ�ɻ�����ָһ����λ�������λ���ֵ������͵��ڸ�������
 *			������153����һ��ˮ�ɻ�����
 *			153 = 1*1*1 + 5*5*5 + 3*3*3
 * ��ʾ�� /  %
 */
public class Demo06 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i <1000; i++) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			if((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i ) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println(count);

	}

}
