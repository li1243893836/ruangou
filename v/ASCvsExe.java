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

/**类描述：加减混合运算
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */

public class ASCvsExe {

	//存储生成的随机算式和答案
	Map<String, Integer> ASMap = new LinkedHashMap<>();

	//生成随机算式集合
	public void ASubtraction(int num) {
		AddFormula add = new AddFormula();
		SubFormula sub = new SubFormula();

		for(int i = 0; i < num ; i++) {
			//生成一个足够大的随机数，通过随机数的奇偶来决定加减法
			int b = (int)(Math.random()*100001);
			String a = null;
			Set<Entry<String,Integer>> set = add.Formula().entrySet();
			Set<Entry<String,Integer>> set1 = sub.Formula().entrySet();
			if(b % 2 == 0) {
				//把生成的随机算式存到Map集合中
				for(Entry<String,Integer> entry : set) {
					a = entry.getKey();
					ASMap.put(a, entry.getValue());
				}
			}
			else if(b % 2 != 0) {
				//把生成的随机算式存到Map集合中
				for(Entry<String,Integer> entry : set1) {
					a = entry.getKey();
					ASMap.put(a, entry.getValue());
				}
			}
			//如果有重复
			if( (i+1) != ASMap.size()) {
				i = ASMap.size() - 1;
			}
		}
	}

	//产生练习文件
			public void outCvs(int num,int sum) throws IOException {
				int i = 0, k = 0;
				//习题存放位置
				String url = "D:\\加减混合运算习题集\\加减混合运算练习题集"+ sum +".csv";
				CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
				//设置列表头
				String[] CsHeader = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};
				//写入cvs文件
				//存放一行算式
				String[] date = new String[10];
				//把Map集合的算式放入一个List集合中，方便输出
				List<String> list = new ArrayList<>(ASMap.keySet());
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

			public void outCvsExe(int num,int sum) throws IOException {
				int i = 0, k = 0;
				//习题存放位置
				String url = "D:\\加减混合运算习题集\\加减混合运算习题集"+ sum +".csv";
				CsvWriter dw = new CsvWriter(url,',', Charset.forName("UTF-8"));
				//设置列表头
				String[] CsHeader = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};
				//写入cvs文件
				//存放一行算式
				String[] date = new String[10];
				//把Map集合的算式放入一个List集合中，方便输出
				List<String> list = new ArrayList<>(ASMap.keySet());
				List<Integer> list1 = new ArrayList<>(ASMap.values());
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

			//批量生成对应的习题集
			public void ProASExe(int num,int sum) throws IOException {
				//产生sum个习题集
				for(int i = 0; i < sum ; i++) {
					//产生算式
					ASubtraction(num);
					//产生练习题集
					outCvs(num,i + 1);
					//产生习题集
					outCvsExe(num ,i +1);
					//清空集合
					ASMap.clear();
				}
				System.out.println("习题产生成功，请在本地磁盘(D:)查看");
			}

}
