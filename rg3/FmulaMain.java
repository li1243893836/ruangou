package com.itly.rg3;

public class FmulaMain {

	public static void main(String[] args) {
		
		CountExercise c = new CountExercise();
		//�ӷ�ϰ�⼯
		c.Addition(50);
		c.outAdd();
		c.outAddResult();
		//����ϰ�⼯
		c.Subtraction(50);
		c.outSub();
		c.outSubResult();
		
		//�Ӽ��������ϰ�⼯
		c.AddandSub(50);
		c.outAddSub();
		c.outAddSubResult();
	}
}
