package com.itly.rg2.v;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**����������������
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */
public class SubExer extends Generate{

	//�洢���ɵ������ʽ�ʹ�
	Map<String, Integer> subMap = new LinkedHashMap<>();


	//���������ʽ����
	public void Subtraction(int num) {
		SubFormula sub = new SubFormula();
		for(int i = 0; i < num ; i++) {
			Set<Entry<String,Integer>> set = sub.Formula().entrySet();
			//�����ɵ������ʽ�浽Map������
			String a = null;
			for(Entry<String,Integer> entry : set) {
				a = entry.getKey();
				subMap.put(a, entry.getValue());
			}
			//������ظ�
			if( (i+1) != subMap.size()) {
				i = subMap.size() - 1;
			}

		}

	}
	public void PrintS(int num) {
		Subtraction(num);
		//�̳и��෽��
		OutForm(subMap);
		OutAnser(subMap);		
	}	
}
