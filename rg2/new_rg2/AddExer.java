package com.itly.rg2.v;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**���������ӷ�����
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */
@SuppressWarnings("all")
public class AddExer extends Generate{

	//�洢���ɵ������ʽ�ʹ�
	Map<String, Integer> addMap = new LinkedHashMap<>();


	//���������ʽ����
		public void Addition(int num) {
			AddFormula add = new AddFormula();
			for(int i = 0; i < num ; i++) {
				Set<Entry<String,Integer>> set = add.Formula().entrySet();
				//�����ɵ������ʽ�浽Map������
				String a = null;
				for(Entry<String,Integer> entry : set) {
					a = entry.getKey();
					addMap.put(a, entry.getValue());
				}
				//������ظ�
				if( (i+1) != addMap.size()) {
					i = addMap.size() - 1;
				}

			}

		}
		public void PrintA(int num) {
			Addition(num);
			//�̳и��෽��
			OutForm(addMap);
			OutAnser(addMap);		
		}		
}