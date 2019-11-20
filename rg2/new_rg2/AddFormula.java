package com.itly.rg4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**类描述：加法算式子类
 *@author: ly
 *@date： 日期：2019/11/15 时间：2019年11月15日17:15:28
 *@version 3.0
 *修改时间：2019年11月20日12:54:59
 *修改内容：利用map集合存储算式和答案
 */
@SuppressWarnings("all")
public class AddFormula extends Arithmetic{


	
	@Override
	public LinkedHashMap<String,Integer> Formula() {	//重写父类方法
		// TODO 自动生成的方法存根
		int[] num = super.GenRan();		//存放生成的随机数
		int fitnum = num[0];			//把随机数导出，转换为字符串，方便集合去重存储
		int secnum = num[1];
		char symbol = '+';
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put(s, num[0]+num[1]);
		return map;			//生成算式保存在集合中返回
	}
	

}
