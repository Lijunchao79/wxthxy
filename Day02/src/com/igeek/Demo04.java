package com.igeek;

import java.util.Scanner;

/**
 * @author Administrator
 * switch (key) {
		case value:
			
			break;

		default:
			break;
		}
		
	����	���ݼ���¼�����ֵ1��2��3����7�����Ӧ������һ�����ڶ�����������������
 */
public class Demo04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		
		int week = scanner.nextInt();
		
		switch (week) {
		case 1:
			System.out.println("����1");
			break;
		case 2:
			System.out.println("����2");
			break;
		case 3:
			System.out.println("����3");
			break;
		case 4:
			System.out.println("����4");
			break;
		case 5:
			System.out.println("����5");
			break;
		case 6:
			System.out.println("����6");
			break;
		case 7:
			System.out.println("����7");
			break;
		default:
			System.out.println("���������������");
			break;
		}

	}

}
