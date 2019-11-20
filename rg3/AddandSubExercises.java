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

	
	int []result3 = new int[500];  //记录答案
	static LinkedHashSet<String> set3 =new LinkedHashSet<String>();//存放习题

	//产生混合算式集合
	public  void AdditionandSub(int num) {
		AddFormula ad = new AddFormula();
		SubFormula ad1 = new SubFormula();
		String str1 = new String() ;
		String str2 = new String() ;
		for(int i = 0; i < num ; i++) {
			if((int)(Math.random()*10001) % 2 == 0) {	//使数据足够大，这样全是+，或-的概率就减小了
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

	//产生混合运算习题集
	public void CSVadd(int sum,int num) throws IOException {
		String src = "D:\\加减混合运算习题集\\加减混合运算习题"+ sum +".csv";
		int i = 0;
		int k = 0;
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//设置列头
		String[] csvHeaders = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};

		//写入cvs文件
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

	//产生混合运算习题的答案
	public void CSVaddresult(int sum,int num) throws IOException {
		int i = 0;
		int k = 0;
		String src = "D:\\加减混合运算习题集\\加减混合运算习题答案"+ sum +".csv";
		
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//设置列头
		String[] csvHeaders = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};

		//写入cvs文件
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
		System.out.println("请输入要产生的习题集的数量：");
		Scanner sc = new Scanner(System.in);
		sum = sc.nextInt();
		System.out.println("请输入每套习题集的习题数量：");
		num = sc.nextInt();
		for(int i = 0; i < sum ; i++) {
			
			
			AdditionandSub(num);
			CSVadd(i + 1,num);
			CSVaddresult(i + 1,num);
			set3.clear();

		}
		System.out.println("习题产生成功！！！请在本地磁盘(D:)查看");
	}
	

}
