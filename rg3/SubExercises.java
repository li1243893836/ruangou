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
	
	
	int []result2 = new int[500];  //记录答案
	static LinkedHashSet<String> set2 =new LinkedHashSet<String>();//存放习题

	//产生减法算式集合
	public  void Addition(int num) {
		SubFormula ad = new SubFormula();	//创建对象
		String str1 = new String() ;	//存储数字
		String str2 = new String() ;
		for(int i = 0; i < num ; i++) {
			String str = String.valueOf(ad.Formula().iterator().next());
			set2.add(str);	//把生成的随机算式存储到集合中
			str1 = str.substring(0,str.indexOf('-'));					//把生成的算式拆分，存储第一个数字
			str2 = str.substring(str.indexOf('-')+1,str.length()-1);	//把生成的算式拆分，存储第二个数字
			result2[i] = Integer.parseInt(str1) - Integer.parseInt(str2);	//记录结果
		}

	}
	//产生减法习题集
	public void CSVadd(int sum,int num) throws IOException {
		String src = "D:\\减法习题集\\减法习题"+ sum +".csv";
		int i=0,k=0;
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//设置列头
		String[] csvHeaders = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};

		//写入cvs文件
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

	//产生加法习题的答案
	public void CSVaddresult(int sum,int num) throws IOException {
		int i = 0,k = 0;
		String src = "D:\\减法习题集\\减法习题答案"+ sum +".csv";
		
		CsvWriter csvWriter = new CsvWriter(src, ',', Charset.forName("UTF-8"));
		//设置列头
		String[] csvHeaders = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};

		//写入cvs文件
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
		System.out.println("请输入要产生的习题集的数量：");
		Scanner sc = new Scanner(System.in);
		sum = sc.nextInt();
		System.out.println("请输入每套习题集的习题数量：");
		num = sc.nextInt();
		for(int i = 0; i < sum ; i++) {
			
			
			Addition(num);
			CSVadd(i + 1,num);
			CSVaddresult(i + 1,num);
			set2.clear();

		}
		System.out.println("习题产生成功！！！请在本地磁盘(D:)查看");
	}


}
