package com.igeek;

import java.util.Scanner;

/**
 * @author Administrator
 *����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
 * 90-100	����
 * 80-90	��
 * 70-80	��
 * 60-70	����
 * 60����	������
 */
public class Demo03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɼ�:");
		int score = scanner.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("����");
		}else if (score>=80 && score<=89) {
			System.out.println("��");
		}else if (score>=70 && score<=79) {
			System.out.println("��");
		}else if (score>=60 && score<=69) {
			System.out.println("����");
		}else if (score<60) {
			System.out.println("������");
		}
		
	}

}
