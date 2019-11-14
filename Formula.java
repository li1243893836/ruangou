package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Formula {

	public static int RandomNum1;static int RandomNum2;		//记录随机数
	public static char Symbol;				//记录符号
	public static Set<String> set = new LinkedHashSet();		//记录无重复算式  LinkedHashSet插入顺序
	public static int []Result = new int[51];		//记录结果
	
	
	public void FormulaSet(int i){		//产生随机数，并记录
		do {											//使算式的结果不大于100，不小于0
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
	}
	
	
	
	
}
