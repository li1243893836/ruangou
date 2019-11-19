package com.itly.rg3;

import java.util.LinkedHashSet;

/**类描述：算式抽象类
 *@author: ly
 *@date： 日期：2019/11/15 时间：2019年11月15日17:15:28
 *@version 2.0
 *修改时间：2019年11月16日09:45:00
 *修改内容：注释
 */
public abstract class Arithmetic {

	public abstract LinkedHashSet<String> Formula();	//生成算式的抽象方法
	
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
