package com.itly.rg3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		AddExercises add = new AddExercises();
		SubExercises sub = new SubExercises();
		AddandSubExercises as = new AddandSubExercises();
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择你要生成的习题集类型：");
		System.out.println("1.加法运算习题集");
		System.out.println("2.减法运算习题集");
		System.out.println("3.加减混合运算习题集");
		System.out.println("=======================华丽的分割线=======================");
		int a = sc.nextInt();
		if(a == 1) {
			add.generate();
		}
		else if(a == 2) {
			sub.generate();
		}
		else if(a == 3) {
			as.generate();
		}
		else{
			System.out.println("输入错误请重新输入！！！");
		}
	}
}
