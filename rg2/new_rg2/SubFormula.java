package com.itly.rg4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**��������������ʽ����
 *@author: ly
 *@date�� ���ڣ�2019/11/15 ʱ�䣺2019��11��20��12:54:22
 *@version 2.0
 *�޸�����:����map���ϴ洢��ʽ�ʹ�
 */
@SuppressWarnings("all")
public class SubFormula extends Arithmetic{



	@Override
	public LinkedHashMap<String,Integer> Formula() {	//��д���෽��
		// TODO �Զ����ɵķ������
		int[] num = super.GenRan();		//������ɵ������
		int fitnum = num[0];			//�������������ת��Ϊ�ַ��������㼯��ȥ�ش洢
		int secnum = num[1];
		char symbol = '-';
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put(s, num[0] - num[1]);
		return map;			//������ʽ�����ڼ����з���
	}


}
