package com.igeek;

import java.util.Random;

/**
 * 
 * @author zx
 * @version 1.0
 * @description:�����
 * �� 0����������ָ��ֵ����������֮����ȷֲ��� int ֵ�� [0,100)
 * 
 */
public class Demo11 {
	
	
	public static void main(String[] args) {
		Random random = new Random();
		//1~100�������
		int i = random.nextInt(10)+1;
		System.out.println(i);
	}

}
