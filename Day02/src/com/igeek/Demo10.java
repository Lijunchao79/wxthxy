package com.igeek;

public class Demo10 {

	public static void main(String[] args) {
		for(int x=1; x<=10; x++) {
			if(x%3==0) {
				//�ֱ�дbreak��continue��˵˵�������
				//break;
				continue;
			}
			System.out.println("helloworld"+x);
		}

	}

}
