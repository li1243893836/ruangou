package com.itly.rg4;

import java.util.Scanner;

/**类描述：主函数
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */

@SuppressWarnings("all")
public class Main {
	
	
	public static void main(String[] args) {
		AddExer add = new AddExer();
		SubExer sub = new SubExer();
		AddandSubExer as = new AddandSubExer();
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------华丽的分割线------------------------");		
		System.out.println("请选择要生成的习题类型");
		System.out.println("1.加法算式：");
		System.out.println("2.减法算式：");
		System.out.println("3.加减混合算式：");
		System.out.println("-------------------华丽的分割线------------------------");
		int a = sc.nextInt();
		System.out.println("请选择要产生的习题的数量：");
		int num = sc.nextInt();
		if(a == 1) {
			add.Addition(num);
			add.OutAdd();
			add.OutAnser();
		}
		else if(a == 2) {
			sub.Subtraction(num);
			sub.OutSub();
			sub.OutSAnser();
		}
		else if(a == 3) {
			as.ASubtraction(num);
			as.OutAS();
			as.OutASnser();
		}
		else {
			System.out.println("输入错误请重新输入！！！");
		}
	}

}
