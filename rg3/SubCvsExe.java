package com.itly.rg3.v;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.csvreader.CsvWriter;

/**����������������
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */

@SuppressWarnings("all")
public class SubCvsExe extends Generate{

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
		//�������ɶ�Ӧ��ϰ�⼯
		public void ProSExe(int num,int sum) throws IOException {
			//����sum��ϰ�⼯
			for(int i = 0; i < sum ; i++) {
				//������ʽ
				Subtraction(num);
				//������ϰ�⼯
				outCvs(num,i + 1,subMap,"����");
				//����ϰ�⼯
				outCvsExe(num ,i +1,subMap,"����");
				//��ռ���
				subMap.clear();
			}
			System.out.println("ϰ������ɹ������ڱ��ش���(D:)�鿴");
		}

}
