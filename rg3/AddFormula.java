package com.itly.rg3;

import java.util.LinkedHashSet;

/**���������ӷ���ʽ����
 *@author: ly
 *@date�� ���ڣ�2019/11/15 ʱ�䣺2019��11��15��17:15:28
 *@version 2.0
 *�޸�ʱ�䣺2019��11��16��09:42:23
 *�޸����ݣ�ע��
 */
public class AddFormula extends Arithmetic{


	@Override
	public LinkedHashSet<String> Formula() {	//��д���෽��
		// TODO �Զ����ɵķ������
		int[] num = super.GenRan();		//������ɵ������
		int fitnum = num[0];			//�������������ת��Ϊ�ַ��������㼯��ȥ�ش洢
		int secnum = num[1];
		char symbol = '+';
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(s);
		return set;			//������ʽ�����ڼ����з���
	}
	

}
