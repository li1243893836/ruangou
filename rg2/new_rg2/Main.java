package com.itly.rg4;

import java.util.Scanner;

/**��������������
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */

@SuppressWarnings("all")
public class Main {
	
	
	public static void main(String[] args) {
		AddExer add = new AddExer();
		SubExer sub = new SubExer();
		AddandSubExer as = new AddandSubExer();
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------�����ķָ���------------------------");		
		System.out.println("��ѡ��Ҫ���ɵ�ϰ������");
		System.out.println("1.�ӷ���ʽ��");
		System.out.println("2.������ʽ��");
		System.out.println("3.�Ӽ������ʽ��");
		System.out.println("-------------------�����ķָ���------------------------");
		int a = sc.nextInt();
		System.out.println("��ѡ��Ҫ������ϰ���������");
		int num = sc.nextInt();
		if(a == 1) {
			add.Addition(num);
			add.OutAdd();
			add.OutAnser();
		}
		else if(a == 2) {
			sub.Subtraction(num);
			sub.OutSub();
			sub.OutSAnser();
		}
		else if(a == 3) {
			as.ASubtraction(num);
			as.OutAS();
			as.OutASnser();
		}
		else {
			System.out.println("����������������룡����");
		}
	}

}
