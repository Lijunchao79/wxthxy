package com.igeek;

/**
 * @author zx
 * @version 1.0
 * @description:���ֲ��ң��۰���ң�
 */
public class Demo21 {

	public static void main(String[] args) {
		int[] arr = {-2,10,45,68,103};
		
		int key = 451;
		
		int left = 0;
		int right = arr.length-1;
		boolean isFlag = false;
		
		while(left<=right) {
			int middle = (left+right)/2;
			if(arr[middle] == key) {
				System.out.println("�ҵ���");
				isFlag = true;
				break;
			}else if(arr[middle] > key) {
				right = middle-1;
			}else {
				left = middle+1;
			}
		}
		if(!isFlag) {
			System.out.println("û�ҵ�");
		}

	}

}
