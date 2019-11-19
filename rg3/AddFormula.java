package com.itly.rg3;

import java.util.LinkedHashSet;

/**类描述：加法算式子类
 *@author: ly
 *@date： 日期：2019/11/15 时间：2019年11月15日17:15:28
 *@version 2.0
 *修改时间：2019年11月16日09:42:23
 *修改内容：注释
 */
public class AddFormula extends Arithmetic{


	@Override
	public LinkedHashSet<String> Formula() {	//重写父类方法
		// TODO 自动生成的方法存根
		int[] num = super.GenRan();		//存放生成的随机数
		int fitnum = num[0];			//把随机数导出，转换为字符串，方便集合去重存储
		int secnum = num[1];
		char symbol = '+';
		String s = String.valueOf(fitnum) + String.valueOf(symbol) + String.valueOf(secnum) + "=";
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(s);
		return set;			//生成算式保存在集合中返回
	}
	

}
