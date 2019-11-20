package com.itly.rg3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import com.csvreader.CsvWriter;

public class AddandSubExercises {

	
	int []result3 = new int[500];  //��¼��
	static LinkedHashSet<String> set3 =new LinkedHashSet<String>();//���ϰ��

	//���������ʽ����
	public  void AdditionandSub(int num) {
		AddFormula ad = new AddFormula();
		SubFormula ad1 = new SubFormula();
		String str1 = new String() ;
		String str2 = new String() ;
		for(int i = 0; i < num ; i++) {
			if((int)(Math.random()*10001) % 2 == 0) {	//ʹ�����㹻������ȫ��+����-�ĸ��ʾͼ�С��
				String str = String.valueOf(ad.Formula().iterator().next());
				set3.add(str);
				str1 = str.substring(0,str.indexOf('+'));
				str2 = str.substring(str.indexOf('+')+1,str.length()-1);
				result3[i] = Integer.parseInt(str1) + Integer.parseInt(str2);
				
			}
			
			else
			{
				String str = String.valueOf(ad1.Formula().iterator().next());
				set3.add(str);
				str1 = str.substring(0,str.indexOf('-'));
				str2 = str.substring(str.indexOf('-')+1,str.length()-1);
				result3[i] = Integer.parseInt(str1) - Integer.parseInt(str2);
				
			}
			
		}
		System.out.println();

	}

	//�����������ϰ�⼯
	public void CSVadd(int sum,int num) throws IOException {
		String src = "D:\\�Ӽ��������ϰ�⼯\\�Ӽ��������ϰ��"+ sum +".csv";
		int i = 0;
		int k = 0;
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//������ͷ
		String[] csvHeaders = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};

		//д��cvs�ļ�
		String []data = new String[10];
		List<String> list = new ArrayList<>(set3);
		csvWriter.writeRecord(csvHeaders);
		for( i=0;i<list.size()/5;i++) {
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

	//�����������ϰ��Ĵ�
	public void CSVaddresult(int sum,int num) throws IOException {
		int i = 0;
		int k = 0;
		String src = "D:\\�Ӽ��������ϰ�⼯\\�Ӽ��������ϰ���"+ sum +".csv";
		
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//������ͷ
		String[] csvHeaders = {"ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��","ϰ��","��"};

		//д��cvs�ļ�
		String []data = new String[10];
		List<String> list = new ArrayList<>(set3);
		csvWriter.writeRecord(csvHeaders);
		for(i=0;i<list.size()/5;i++) {
			for(int j = 0; j < 10 ;j+=2) {
				if(k > list.size()) {
					break;
				}
				data[j] = list.get(k);
				data[j+1] = String.valueOf(result3[k]);
				k++;
			}
			
			csvWriter.writeRecord(data);
		}
		if(list.size() % 5 != 0) {
			for(i = k;i < list.size() ;i++) {
				csvWriter.write(list.get(i) );
				csvWriter.write( String.valueOf(result3[i]) );
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
			
			
			AdditionandSub(num);
			CSVadd(i + 1,num);
			CSVaddresult(i + 1,num);
			set3.clear();

		}
		System.out.println("ϰ������ɹ����������ڱ��ش���(D:)�鿴");
	}
	

}
