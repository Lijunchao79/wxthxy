package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:
 * ���Բ���
 */
public class Demo20 {

	public static void main(String[] args) {
		
		String[] str = {"AA","BB","DD","GG"};
		
		String str2 = "GG";
		boolean isFlag = false;
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(str2)) {
				System.out.println("�ҵ���Ԫ��:"+str[i]);
				isFlag = true;
				break;
			}
		}
		if(!isFlag) {
			System.out.println("û���ҵ���Ԫ��");
		}
	}

}
