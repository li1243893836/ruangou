package com.itly.rg3.v;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.csvreader.CsvWriter;

public class Generate {
	
	//产生练习文件
		public void outCvs(int num,int sum,Map<String , Integer> map,String type) throws IOException {
			int i = 0, k = 0;
			//习题存放位置
			String url = "D:\\"+ type +"运算习题集\\"+ type +"运算练习题集"+ sum +".csv";
			CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
			//设置列表头
			String[] CsHeader = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};
			//写入cvs文件
			//存放一行算式
			String[] date = new String[10];
			//把Map集合的算式放入一个List集合中，方便输出
			List<String> list = new ArrayList<>(map.keySet());
			//写出列表头
			dw.writeRecord(CsHeader);
			//设置5个算式一列
			for(i = 0;i < list.size() / 5 ;i++) {
				if(k > list.size()) {
					break;
				}
				//一列十格
				for(int j = 0; j < 10 ;j += 2) {
					date[j] = list.get(k);
					date[j+1] = "";
					k++;
				}
				dw.writeRecord(date);
			}
			//把多余的算式依次输出
			if(list.size() % 5 != 0 ) {
				for(i = k; i < list.size() ;i++) {
					dw.write(list.get(i));
					dw.write("");
				}
			}
			//把缓冲区的刷新到文件中
			dw.flush();
			//关闭
			dw.close();		
		}

		//产生习题文件

		public void outCvsExe(int num,int sum,Map<String , Integer> map,String type ) throws IOException {
			int i = 0, k = 0;
			//习题存放位置
			String url = "D:\\" + type  + "运算习题集\\" + type +"运算习题集"+ sum +".csv";
			CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
			//设置列表头
			String[] CsHeader = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};
			//写入cvs文件
			//存放一行算式
			String[] date = new String[10];
			//把Map集合的算式放入一个List集合中，方便输出
			List<String> list = new ArrayList<>(map.keySet());
			List<Integer> list1 = new ArrayList<>(map.values());
			//写出列表头
			dw.writeRecord(CsHeader);
			//设置5个算式一列
			for(i = 0;i < list.size() / 5 ;i++) {
				if(k > list.size()) {
					break;
				}
				//一列十格
				for(int j = 0; j < 10 ;j += 2) {
					date[j] = list.get(k);
					date[j+1] = String.valueOf(list1.get(k));
					k++;			
				}
				dw.writeRecord(date);
			}
			//把多余的算式依次输出
			if(list.size() % 5 != 0 ) {
				for(i = k; i < list.size() ;i++) {
					dw.write(list.get(i));
					dw.write(String.valueOf(list1.get(i)));
				}
			}
			//把缓冲区的刷新到文件中
			dw.flush();
			//关闭
			dw.close();		
		}

}
