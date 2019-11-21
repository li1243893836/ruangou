package com.itly.rg3.v;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.csvreader.CsvWriter;

public class Generate {
	
	//������ϰ�ļ�
		public void outCvs(int num,int sum,Map<String , Integer> map,String type) throws IOException {
			int i = 0, k = 0;
			//ϰ����λ��
			String url = "D:\\"+ type +"����ϰ�⼯\\"+ type +"������ϰ�⼯"+ sum +".csv";
			CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
			//�����б�ͷ
			String[] CsHeader = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};
			//д��cvs�ļ�
			//���һ����ʽ
			String[] date = new String[10];
			//��Map���ϵ���ʽ����һ��List�����У��������
			List<String> list = new ArrayList<>(map.keySet());
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

		public void outCvsExe(int num,int sum,Map<String , Integer> map,String type ) throws IOException {
			int i = 0, k = 0;
			//ϰ����λ��
			String url = "D:\\" + type  + "����ϰ�⼯\\" + type +"����ϰ�⼯"+ sum +".csv";
			CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
			//�����б�ͷ
			String[] CsHeader = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};
			//д��cvs�ļ�
			//���һ����ʽ
			String[] date = new String[10];
			//��Map���ϵ���ʽ����һ��List�����У��������
			List<String> list = new ArrayList<>(map.keySet());
			List<Integer> list1 = new ArrayList<>(map.values());
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

}
