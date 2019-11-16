package com.itly.rg2;

import java.util.LinkedHashSet;

/**类描述：减法算式子类
 *@author: ly
 *@date： 日期：2019/11/15 时间：2019年11月15日17:15:28
 *@version 2.0
 */
public class SubFormula extends Arithmetic{

	@Override
	public LinkedHashSet<String> Formula() {	//重写父类方法
		// TODO 自动生成的方法存根
		int[] num = super.GenRan();
		int fitnum = num[0];
		int secnum = num[1];
		char symbol = '-';
		//跟加法子类一样的道理
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(s);
		return set;
	}
	
}
