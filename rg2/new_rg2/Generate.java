package com.itly.rg2.v;

import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class Generate {
	
	//��������ʽ
		public void OutForm(Map<String,Integer> map) {
			int i = 0;
			Set<Entry<String,Integer>> set = map.entrySet();
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
		public void OutAnser(Map<String,Integer> map) {
			int i = 0;
			Set<Entry<String,Integer>> set = map.entrySet();
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
