package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:continue ��������ѭ��������ѭ������һ��
 */
public class Demo09 {

	public static void main(String[] args) {
		for(int i= 1;i<=10;i++) {
			if(i == 10) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("hi");
	}

}
