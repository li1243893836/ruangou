package com.itly.rg4;

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
public class AddExer {

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
	//��������ʽ
	public void OutAdd() {
		int i = 0;
		Set<Entry<String,Integer>> set = addMap.entrySet();
		//��������ʽ
		for(Entry<String,Integer> entry : set) {

			System.out.print((i + 1) + ":" + entry.getKey() +" \t");

			//ÿ�����ʽΪһ��
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
			i++;
		}

	}

	//��������ʽ�Ĵ�
	public void OutAnser() {
		int i = 0;
		Set<Entry<String,Integer>> set = addMap.entrySet();
		//��������ʽ
		System.out.println();
		System.out.println("--------------------------�����ķָ���-------------------------------------");
		for(Entry<String,Integer> entry : set) {

			System.out.print((i + 1) + ":" + entry.getValue() +" \t\t");

			//ÿ�����Ϊһ��
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
			i++;
		}
	}



}
