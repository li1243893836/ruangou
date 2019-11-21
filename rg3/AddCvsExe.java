package com.itly.rg3.v;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.csvreader.CsvWriter;

/**���������ӷ�����
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */
@SuppressWarnings("all")
public class AddCvsExe extends Generate{

	//�洢���ɵ������ʽ�ʹ�
	Map<String, Integer> addMap = new LinkedHashMap<>();
	//���������ʽ����
	public void Addition(int num) {
		int i = 0;
		AddFormula add = new AddFormula();
		for( i = 0; i < num ; i++) {
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

	//�������ɶ�Ӧ��ϰ�⼯
	public void ProExe(int num,int sum) throws IOException {
		//����sum��ϰ�⼯
		for(int i = 0; i < sum ; i++) {
			//������ʽ
			Addition(num);
			//������ϰ�⼯
			outCvs(num,i + 1, addMap, "�ӷ�");
			//����ϰ�⼯
			outCvsExe(num ,i +1,addMap,"�ӷ�");
			//��ռ���
			addMap.clear();
		}
		System.out.println("ϰ������ɹ������ڱ��ش���(D:)�鿴");
	}
}
