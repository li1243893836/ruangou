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
@SuppressWarnings("all")
public class ASCvsExe extends Generate{

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
	//批量生成对应的习题集
	public void ProASExe(int num,int sum) throws IOException {
		//产生sum个习题集
		for(int i = 0; i < sum ; i++) {
			//产生算式
			ASubtraction(num);
			//产生练习题集
			outCvs(num,i + 1,ASMap,"加减混合");
			//产生习题集
			outCvsExe(num ,i +1,ASMap,"加减混合");
			//清空集合
			ASMap.clear();
		}
		System.out.println("习题产生成功，请在本地磁盘(D:)查看");
	}

}
