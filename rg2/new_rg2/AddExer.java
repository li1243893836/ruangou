package com.itly.rg4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**类描述：加法运算
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */
@SuppressWarnings("all")
public class AddExer {

	//存储生成的随机算式和答案
	Map<String, Integer> addMap = new LinkedHashMap<>();


	//生成随机算式集合
		public void Addition(int num) {
			AddFormula add = new AddFormula();
			for(int i = 0; i < num ; i++) {
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
	//输出随机算式
	public void OutAdd() {
		int i = 0;
		Set<Entry<String,Integer>> set = addMap.entrySet();
		//输出随机算式
		for(Entry<String,Integer> entry : set) {

			System.out.print((i + 1) + ":" + entry.getKey() +" \t");

			//每五个算式为一行
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
			i++;
		}

	}

	//输出随机算式的答案
	public void OutAnser() {
		int i = 0;
		Set<Entry<String,Integer>> set = addMap.entrySet();
		//输出随机算式
		System.out.println();
		System.out.println("--------------------------华丽的分割线-------------------------------------");
		for(Entry<String,Integer> entry : set) {

			System.out.print((i + 1) + ":" + entry.getValue() +" \t\t");

			//每五个答案为一行
			if((i + 1) % 5 == 0) {
				System.out.println();
			}
			i++;
		}
	}



}
