package com.itly.rg3;

import java.util.LinkedHashSet;

/**����������ʽ������
 *@author: ly
 *@date�� ���ڣ�2019/11/15 ʱ�䣺2019��11��15��17:15:28
 *@version 2.0
 *�޸�ʱ�䣺2019��11��16��09:45:00
 *�޸����ݣ�ע��
 */
public abstract class Arithmetic {

	public abstract LinkedHashSet<String> Formula();	//������ʽ�ĳ��󷽷�
	
	public int[] GenRan() {	//���������
		int num1,num2;		//��¼���ɵ������
		int[] num = new int[2];			//�����ɵ��������Ϊ���鷵��
		
		do {
			num1 = (int)(Math.random() * 101);
			num2 = (int)(Math.random() * 101);
		}while(num1 + num2 > 100 || num1 - num2 < 0);	//ʹ���ɵ���������㲻����100����С��0��Ҫ��
		num[0] = num1; num[1] = num2;
		return num;		//�����ɵ�����������������з���
	}
	
	
	
}
