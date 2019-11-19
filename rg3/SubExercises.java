package com.itly.rg3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import com.csvreader.CsvWriter;

public class SubExercises {
	
	
	int []result2 = new int[500];  //��¼��
	static LinkedHashSet<String> set2 =new LinkedHashSet<String>();//���ϰ��

	//����������ʽ����
	public  void Addition(int num) {
		SubFormula ad = new SubFormula();	//��������
		String str1 = new String() ;	//�洢����
		String str2 = new String() ;
		for(int i = 0; i < num ; i++) {
			String str = String.valueOf(ad.Formula().iterator().next());
			set2.add(str);	//�����ɵ������ʽ�洢��������
			str1 = str.substring(0,str.indexOf('-'));					//�����ɵ���ʽ��֣��洢��һ������
			str2 = str.substring(str.indexOf('-')+1,str.length()-1);	//�����ɵ���ʽ��֣��洢�ڶ�������
			result2[i] = Integer.parseInt(str1) - Integer.parseInt(str2);	//��¼���
		}

	}
	//��������ϰ�⼯
	public void CSVadd(int sum,int num) throws IOException {
		String src = "D:\\����ϰ�⼯\\����ϰ��"+ sum +".csv";
		int i=0,k=0;
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//������ͷ
		String[] csvHeaders = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};

		//д��cvs�ļ�
		String []data = new String[10];
		List<String> list = new ArrayList<>(set2);
		csvWriter.writeRecord(csvHeaders);
		for(i=0;i<list.size()/5;i++) {
			for(int j = 0; j < 10 ;j+=2) {
				if(k > list.size()) {
					break;
				}
				data[j] = list.get(k);
				data[j+1] = "";
				k++;
			}
			
			csvWriter.writeRecord(data);
		}
		if(list.size() % 5 != 0) {
			for(i = k;i < list.size() ;i++) {
				csvWriter.write(list.get(i) );
				csvWriter.write("" );
			}
		}
		csvWriter.close();

	}

	//�����ӷ�ϰ��Ĵ�
	public void CSVaddresult(int sum,int num) throws IOException {
		int i = 0,k = 0;
		String src = "D:\\����ϰ�⼯\\����ϰ���"+ sum +".csv";
		
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//������ͷ
		String[] csvHeaders = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};

		//д��cvs�ļ�
		String []data = new String[10];
		List<String> list = new ArrayList<>(set2);
		csvWriter.writeRecord(csvHeaders);
		for(i=0;i<list.size()/5;i++) {
			for(int j = 0; j < 10 ;j+=2) {
				if(k > list.size()) {
					break;
				}
				data[j] = list.get(k);
				data[j+1] = String.valueOf(result2[k]);
				k++;
			}
			
			csvWriter.writeRecord(data);
		}
		if(list.size() % 5 != 0) {
			for(i = k;i < list.size() ;i++) {
				csvWriter.write(list.get(i) );
				csvWriter.write( String.valueOf(result2[i]) );
			}
		}
		csvWriter.close();

	}

	public void generate( ) throws IOException {
		int sum =0;int num = 0;
		System.out.println("������Ҫ������ϰ�⼯��������");
		Scanner sc = new Scanner(System.in);
		sum = sc.nextInt();
		System.out.println("������ÿ��ϰ�⼯��ϰ��������");
		num = sc.nextInt();
		for(int i = 0; i < sum ; i++) {
			
			
			Addition(num);
			CSVadd(i + 1,num);
			CSVaddresult(i + 1,num);
			set2.clear();

		}
		System.out.println("ϰ������ɹ����������ڱ��ش���(D:)�鿴");
	}


}
