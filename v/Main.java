package com.itly.rg3.v;


import java.io.IOException;
import java.util.Scanner;

/**��������������
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */

@SuppressWarnings("all")
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		AddCvsExe add = new AddCvsExe();
		SubCvsExe sub = new SubCvsExe();
		ASCvsExe as = new ASCvsExe();
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------�����ķָ���------------------------");		
		System.out.println("��ѡ��Ҫ���ɵ�ϰ������");
		System.out.println("1.�ӷ���ʽϰ�⼯��");
		System.out.println("2.������ʽϰ�⼯��");
		System.out.println("3.�Ӽ������ʽϰ�⼯��");
		System.out.println("-------------------�����ķָ���------------------------");
		int a = sc.nextInt();
		System.out.println("������Ҫ������ϰ�⼯��������");
		int sum = sc.nextInt();
		System.out.println("������ÿ��ϰ�⼯��ϰ��������");
		int num = sc.nextInt();
		if(a == 1) {
			add.ProExe(num, sum);
		}
		else if(a == 2) {
			sub.ProSExe(num, sum);
		}
		else if(a == 3) {
			as.ProASExe(num, sum);
		}
		else {
			System.out.println("����������������룡����");
		}
	}

}
