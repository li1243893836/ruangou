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

public class ASCvsExe {

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

	//������ϰ�ļ�
			public void outCvs(int num,int sum) throws IOException {
				int i = 0, k = 0;
				//ϰ����λ��
				String url = "D:\\�Ӽ��������ϰ�⼯\\�Ӽ����������ϰ�⼯"+ sum +".csv";
				CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
				//�����б�ͷ
				String[] CsHeader = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};
				//д��cvs�ļ�
				//���һ����ʽ
				String[] date = new String[10];
				//��Map���ϵ���ʽ����һ��List�����У��������
				List<String> list = new ArrayList<>(ASMap.keySet());
				//д���б�ͷ
				dw.writeRecord(CsHeader);
				//����5����ʽһ��
				for(i = 0;i < list.size() / 5 ;i++) {
					if(k > list.size()) {
						break;
					}
					//һ��ʮ��
					for(int j = 0; j < 10 ;j += 2) {
						date[j] = list.get(k);
						date[j+1] = "";
						k++;
					}
					dw.writeRecord(date);
				}
				//�Ѷ������ʽ�������
				if(list.size() % 5 != 0 ) {
					for(i = k; i < list.size() ;i++) {
						dw.write(list.get(i));
						dw.write("");
					}
				}
				//�ѻ�������ˢ�µ��ļ���
				dw.flush();
				//�ر�
				dw.close();		
			}

			//����ϰ���ļ�

			public void outCvsExe(int num,int sum) throws IOException {
				int i = 0, k = 0;
				//ϰ����λ��
				String url = "D:\\�Ӽ��������ϰ�⼯\\�Ӽ��������ϰ�⼯"+ sum +".csv";
				CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
				//�����б�ͷ
				String[] CsHeader = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};
				//д��cvs�ļ�
				//���һ����ʽ
				String[] date = new String[10];
				//��Map���ϵ���ʽ����һ��List�����У��������
				List<String> list = new ArrayList<>(ASMap.keySet());
				List<Integer> list1 = new ArrayList<>(ASMap.values());
				//д���б�ͷ
				dw.writeRecord(CsHeader);
				//����5����ʽһ��
				for(i = 0;i < list.size() / 5 ;i++) {
					if(k > list.size()) {
						break;
					}
					//һ��ʮ��
					for(int j = 0; j < 10 ;j += 2) {
						date[j] = list.get(k);
						date[j+1] = String.valueOf(list1.get(k));
						k++;			
					}
					dw.writeRecord(date);
				}
				//�Ѷ������ʽ�������
				if(list.size() % 5 != 0 ) {
					for(i = k; i < list.size() ;i++) {
						dw.write(list.get(i));
						dw.write(String.valueOf(list1.get(i)));
					}
				}
				//�ѻ�������ˢ�µ��ļ���
				dw.flush();
				//�ر�
				dw.close();		
			}

			//�������ɶ�Ӧ��ϰ�⼯
			public void ProASExe(int num,int sum) throws IOException {
				//����sum��ϰ�⼯
				for(int i = 0; i < sum ; i++) {
					//������ʽ
					ASubtraction(num);
					//������ϰ�⼯
					outCvs(num,i + 1);
					//����ϰ�⼯
					outCvsExe(num ,i +1);
					//��ռ���
					ASMap.clear();
				}
				System.out.println("ϰ������ɹ������ڱ��ش���(D:)�鿴");
			}

}
