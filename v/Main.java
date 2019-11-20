package com.itly.rg3.v;


import java.io.IOException;
import java.util.Scanner;

/**类描述：主函数
 *@author: ly
 *@date： 日期：2019/11/20 时间：2019年11月20日18:47:46
 *@version 1.0
 */

@SuppressWarnings("all")
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		AddCvsExe add = new AddCvsExe();
		SubCvsExe sub = new SubCvsExe();
		ASCvsExe as = new ASCvsExe();
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------华丽的分割线------------------------");		
		System.out.println("请选择要生成的习题类型");
		System.out.println("1.加法算式习题集：");
		System.out.println("2.减法算式习题集：");
		System.out.println("3.加减混合算式习题集：");
		System.out.println("-------------------华丽的分割线------------------------");
		int a = sc.nextInt();
		System.out.println("请输入要产生的习题集的数量：");
		int sum = sc.nextInt();
		System.out.println("请输入每套习题集的习题数量：");
		int num = sc.nextInt();
		if(a == 1) {
			add.ProExe(num, sum);
		}
		else if(a == 2) {
			sub.ProSExe(num, sum);
		}
		else if(a == 3) {
			as.ProASExe(num, sum);
		}
		else {
			System.out.println("输入错误请重新输入！！！");
		}
	}

}
