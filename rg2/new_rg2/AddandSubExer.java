package com.itly.rg2.v;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**���������Ӽ��������
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */
public class AddandSubExer extends Generate{

	//�洢���ɵ������ʽ�ʹ�
	Map<String, Integer> ASMap = new LinkedHashMap<>();

	//���������ʽ����
	public void ASubtraction(int num) {
		AddFormula add = new AddFormula();
		SubFormula sub = new SubFormula();

		for(int i = 0; i < num ; i++) {
			//����һ���㹻����������ͨ�����������ż�������Ӽ���
			int b = (int)(Math.random()*100001);
			String a = null;
			Set<Entry<String,Integer>> set = add.Formula().entrySet();
			Set<Entry<String,Integer>> set1 = sub.Formula().entrySet();
			if(b % 2 == 0) {
				//�����ɵ������ʽ�浽Map������
				for(Entry<String,Integer> entry : set) {
					a = entry.getKey();
					ASMap.put(a, entry.getValue());
				}
			}
			else if(b % 2 != 0) {
				//�����ɵ������ʽ�浽Map������
				for(Entry<String,Integer> entry : set1) {
					a = entry.getKey();
					ASMap.put(a, entry.getValue());
				}
			}
			//������ظ�
			if( (i+1) != ASMap.size()) {
				i = ASMap.size() - 1;
			}
		}
	}
	public void PrintAS(int num) {
		ASubtraction(num);
		//�̳и��෽��
		OutForm(ASMap);
		OutAnser(ASMap);		
	}	
}
