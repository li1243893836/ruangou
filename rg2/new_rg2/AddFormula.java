package com.itly.rg4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**���������ӷ���ʽ����
 *@author: ly
 *@date�� ���ڣ�2019/11/15 ʱ�䣺2019��11��15��17:15:28
 *@version 3.0
 *�޸�ʱ�䣺2019��11��20��12:54:59
 *�޸����ݣ�����map���ϴ洢��ʽ�ʹ�
 */
@SuppressWarnings("all")
public class AddFormula extends Arithmetic{


	
	@Override
	public LinkedHashMap<String,Integer> Formula() {	//��д���෽��
		// TODO �Զ����ɵķ������
		int[] num = super.GenRan();		//������ɵ������
		int fitnum = num[0];			//�������������ת��Ϊ�ַ��������㼯��ȥ�ش洢
		int secnum = num[1];
		char symbol = '+';
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put(s, num[0]+num[1]);
		return map;			//������ʽ�����ڼ����з���
	}
	

}
