package com.itly.rg4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**类描述：加减混合运算
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */

public class AddandSubExer {

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

	//输出随机算式
	public void OutAS() {
		int i = 0;
		Set<Entry<String,Integer>> set = ASMap.entrySet();
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
	public void OutASnser() {
		int i = 0;
		Set<Entry<String,Integer>> set = ASMap.entrySet();
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
