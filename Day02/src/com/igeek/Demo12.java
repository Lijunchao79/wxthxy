package com.igeek;

import java.util.Random;
import java.util.Scanner;

/**
 * @author zx
 * @version 1.0
 * @description:
 * ������С��Ϸ����
 *		ϵͳ����һ��1-100֮������������³���������Ƕ��١�
 *		A:ϵͳ����һ�������1-100֮��ġ�
 * 			int number = r.nextInt(100) + 1;
 * 		B:����¼������Ҫ�µ�����
 * 			��Scannerʵ��
 *		C:�Ƚ�����������(��if���)
 *			���ˣ�������ʾ����
 *			С�ˣ�������ʾС��
 *			�����ˣ�������ʾ����ϲ�㣬������
 *		D:��β����ݣ������ǲ�֪��Ҫ�¶��ٴΣ���ô����?
 */
public class Demo12 {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100)+1;
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������:");
			int guessNum = scanner.nextInt();
			if(guessNum > number) {
				System.out.println("����");
			}else if (guessNum < number) {
				System.out.println("С��");
			}else {
				System.out.println("�����ˣ�����");
				break;
			}
		}
		
	}

}
