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

/**���������Ӽ��������
 *@author: ly
 *@date�� ���ڣ�2019/11/20 ʱ�䣺2019��11��20��18:47:46
 *@version 1.0
 */
@SuppressWarnings("all")
public class ASCvsExe extends Generate{

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
	//�������ɶ�Ӧ��ϰ�⼯
	public void ProASExe(int num,int sum) throws IOException {
		//����sum��ϰ�⼯
		for(int i = 0; i < sum ; i++) {
			//������ʽ
			ASubtraction(num);
			//������ϰ�⼯
			outCvs(num,i + 1,ASMap,"�Ӽ����");
			//����ϰ�⼯
			outCvsExe(num ,i +1,ASMap,"�Ӽ����");
			//��ռ���
			ASMap.clear();
		}
		System.out.println("ϰ������ɹ������ڱ��ش���(D:)�鿴");
	}

}
