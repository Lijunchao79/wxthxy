package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * �����Ĳ������������ͣ�	��ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 */
public class Demo26 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+";"+b);
		add(a, b);
		System.out.println(a+";"+b);

	}
	
	public static void add (int a,int b) {
		a++;
		b++;
		System.out.println(a+";"+b);
	}

}
