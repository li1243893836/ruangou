package com.itly.rg3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		AddExercises add = new AddExercises();
		SubExercises sub = new SubExercises();
		AddandSubExercises as = new AddandSubExercises();
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ���ɵ�ϰ�⼯���ͣ�");
		System.out.println("1.�ӷ�����ϰ�⼯");
		System.out.println("2.��������ϰ�⼯");
		System.out.println("3.�Ӽ��������ϰ�⼯");
		System.out.println("=======================�����ķָ���=======================");
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
			System.out.println("����������������룡����");
		}
	}
}
