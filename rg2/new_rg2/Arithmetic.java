package com.itly.rg4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**类描述：算式抽象类
 *@author: ly
 *@date： 日期：2019/11/15 时间：2019年11月15日17:15:28
 *@version 3.0
 *修改时间：2019年11月20日12:55:35
 *修改内容：利用map集合存储算式和集合
 */
@SuppressWarnings("all")
public abstract class Arithmetic {

	public abstract LinkedHashMap<String,Integer> Formula();	//生成算式的抽象方法
	
	public int[] GenRan() {	//生成随机数
		int num1,num2;		//记录生成的随机数
		int[] num = new int[2];			//把生成的随机数作为数组返回
		
		do {
			num1 = (int)(Math.random() * 101);
			num2 = (int)(Math.random() * 101);
		}while(num1 + num2 > 100 || num1 - num2 < 0);	//使生成的随机数满足不大于100，不小于0的要求
		num[0] = num1; num[1] = num2;
		return num;		//把生成的随机数保存在数组中返回
	}
	
	
	
}
