package com.itly.rg2;

import java.util.LinkedHashSet;

public class FormulaMain {

	public static void main(String[] args) {

		AddFormula fmula =new AddFormula();
		LinkedHashSet<String> set = new LinkedHashSet();
		set = fmula.Formula();
		System.out.println(set);
		
		SubFormula fmula1 = new SubFormula();
		LinkedHashSet<String> set1 = new LinkedHashSet();
		set1 = fmula1.Formula();
		System.out.println(set1);
	}

	
}
