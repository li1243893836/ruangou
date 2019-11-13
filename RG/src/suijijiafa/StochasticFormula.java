package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class StochasticFormula {
	static int RandomNum1;static int RandomNum2;		//记录随机数
	static char Symbol;				//记录符号
//	static String []d = new String[51];		//记录算式
	static Set<String> set = new LinkedHashSet();		//记录无重复算式  LinkedHashSet插入顺序
	static int []Result = new int[51];		//记录结果
	public void FormulaSet() {	//产生随机数，并记录
		for(;set.size()<50;) {
			int i = set.size();			//记录个数
			do {
				RandomNum1 = (int)(Math.random()*100);
				RandomNum2 = (int)(Math.random()*100);
				}while((RandomNum1 + RandomNum2 > 100) || (RandomNum1 - RandomNum2 < 0));
			if((int)(Math.random()*100)%2 == 0) {		//控制加减法
				Symbol = '+';
				set.add(RandomNum1+"+"+RandomNum2);			//写入算式
				Result[i] = RandomNum1 + RandomNum2;		//记录算式结果
			}
			else {
				Symbol = '-';
				set.add(RandomNum1 + "-" + RandomNum2);
				Result[i] = RandomNum1 - RandomNum2;
			}
			int j = 0;
			String Temp1 = "RandomNum1" + Symbol + "RandomNum2";		//记录本次产生的随机算式
			for(Object object1:set) {									//去除那些类似1+3、3+1的重复算式
				j++;
				String Temp = "RandomNum2" + Symbol + "RandomNum1";		//记录与本次产生的随机算式相反算式
				if(Temp==object1) {
					break;
				}
			}
			if(j!=set.size()) {								//j!=当前大小说明，有重复，remove现在的算式
				set.remove(Temp1);
			}
			
		}
	}
	
	
	public void OutputFormula() {		//输出算式
		int i = 0;
		for(Object object:set) {
			i++;
			System.out.print(object + "=" + "\t\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public void OutputResult() {			//输出结果
		for(int i = 0;i < 50; i++ ) {
			System.out.println("第" + (i + 1) + "道题答案为：" + Result[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		StochasticFormula ran = new StochasticFormula();
		ran.FormulaSet();
		ran.OutputFormula();
		System.out.println("\t\t\t\t"+"****参考答案****"+"\t\t\t\t");
		ran.OutputResult();
		
	}
}
