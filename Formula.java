package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Formula {

	public static int random1;static int random2;		//记录随机数
	public static char symbol;				//记录符号
	public static Set<String> set = new LinkedHashSet();		//记录无重复算式  LinkedHashSet插入顺序
	public static int []result = new int[51];		//记录结果
	
	
	public void FormulaSet(int i){		//产生随机数，并记录
		do {											//使算式的结果不大于100，不小于0
				random1 = (int)(Math.random()*100);
				random2 = (int)(Math.random()*100);
			}while((random1 + random2 > 100) || (random1 - random2 < 0));
		if((int)(Math.random()*100)%2 == 0) {		//控制加减法
			symbol = '+';
			set.add(RandomNum1+"+"+RandomNum2);			//写入算式
			result[i] = random1 + random2;		//记录算式结果
		}
		else {
			symbol = '-';
			set.add(random1 + "-" + random2);
			result[i] = random1 - random2;
		}
	}
	
	
	
	
}
