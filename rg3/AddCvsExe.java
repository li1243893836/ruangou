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

/**类描述：加法运算
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */
@SuppressWarnings("all")
public class AddCvsExe extends Generate{

	//存储生成的随机算式和答案
	Map<String, Integer> addMap = new LinkedHashMap<>();
	//生成随机算式集合
	public void Addition(int num) {
		int i = 0;
		AddFormula add = new AddFormula();
		for( i = 0; i < num ; i++) {
			Set<Entry<String,Integer>> set = add.Formula().entrySet();
			//把生成的随机算式存到Map集合中
			String a = null;
			for(Entry<String,Integer> entry : set) {
				a = entry.getKey();
				addMap.put(a, entry.getValue());
			}
			//如果有重复
			if( (i+1) != addMap.size()) {
				i = addMap.size() - 1;
			}

		}
	}

	//批量生成对应的习题集
	public void ProExe(int num,int sum) throws IOException {
		//产生sum个习题集
		for(int i = 0; i < sum ; i++) {
			//产生算式
			Addition(num);
			//产生练习题集
			outCvs(num,i + 1, addMap, "加法");
			//产生习题集
			outCvsExe(num ,i +1,addMap,"加法");
			//清空集合
			addMap.clear();
		}
		System.out.println("习题产生成功，请在本地磁盘(D:)查看");
	}
}
