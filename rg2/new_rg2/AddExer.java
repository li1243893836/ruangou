package com.itly.rg2.v;

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
public class AddExer extends Generate{

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
		public void PrintA(int num) {
			Addition(num);
			//继承父类方法
			OutForm(addMap);
			OutAnser(addMap);		
		}		
}