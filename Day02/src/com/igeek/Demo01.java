package com.igeek;

/**
 * @author Administrator
 * 
 * ���η� ����ֵ���� ������(�������� ������1���������� ������2��) {
			������;
			return ����ֵ;
   }
 * 
 * ���η�:public
 * 
 * ����ֵ���� ��void
 * 
 */
public class Demo01 {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		int c = add(a, b);
//		System.out.println(c);
		
		Demo01 demo01 = new Demo01();
		int d = demo01.add(a, b);
		System.out.println(d);
	}
	
	public int add(int a,int b) {
		return a+b;
	}

}
