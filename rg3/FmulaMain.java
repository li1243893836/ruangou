package com.itly.rg3;

public class FmulaMain {

	public static void main(String[] args) {
		
		CountExercise c = new CountExercise();
		//加法习题集
		c.Addition(50);
		c.outAdd();
		c.outAddResult();
		//减法习题集
		c.Subtraction(50);
		c.outSub();
		c.outSubResult();
		
		//加减混合运算习题集
		c.AddandSub(50);
		c.outAddSub();
		c.outAddSubResult();
	}
}
