package com.itly.rg2;

import java.util.LinkedHashSet;

/**��������������ʽ����
 *@author: ly
 *@date�� ���ڣ�2019/11/15 ʱ�䣺2019��11��15��17:15:28
 *@version 2.0
 */
public class SubFormula extends Arithmetic{

	@Override
	public LinkedHashSet Formula() {	//��д���෽��
		// TODO �Զ����ɵķ������
		int[] num = super.GenRan();
		int fitnum = num[0];
		int secnum = num[1];
		char symbol = '-';
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashSet<String> set = new LinkedHashSet();
		set.add(s);
		return set;
	}
	
}
