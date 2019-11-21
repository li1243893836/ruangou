package com.itly.rg2.v;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**类描述：减法运算
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */
public class SubExer extends Generate{

	//存储生成的随机算式和答案
	Map<String, Integer> subMap = new LinkedHashMap<>();


	//生成随机算式集合
	public void Subtraction(int num) {
		SubFormula sub = new SubFormula();
		for(int i = 0; i < num ; i++) {
			Set<Entry<String,Integer>> set = sub.Formula().entrySet();
			//把生成的随机算式存到Map集合中
			String a = null;
			for(Entry<String,Integer> entry : set) {
				a = entry.getKey();
				subMap.put(a, entry.getValue());
			}
			//如果有重复
			if( (i+1) != subMap.size()) {
				i = subMap.size() - 1;
			}

		}

	}
	public void PrintS(int num) {
		Subtraction(num);
		//继承父类方法
		OutForm(subMap);
		OutAnser(subMap);		
	}	
}
