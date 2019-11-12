package suijijiafa;

import java.util.HashSet;
import java.util.Set;

public class Fifty {

	static int a;static int b;		//记录随机数
	static char c;				//记录符号
//	static String []d = new String[51];		//记录算式
	Set<String> set = new HashSet();		//记录无重复算式
	static int []e = new int[51];		//记录结果
	public void suiji() {	//产生随机数，并记录
		for(int i = 1;i <= 50;i++) {
			do {
					a = (int)(Math.random()*100);
					b = (int)(Math.random()*100);
				}while((a + b > 100) || (a - b < 0));
			if((int)(Math.random()*100)%2 == 0) {		//控制加减法
				c = '+';
				e[i] = a + b;
				set.add(a+"+"+b);
			}
			else {
				c = '-';
				e[i] = a - b;
				set.add(a+"-"+b);
			}
		}
	}
	
	
	public void output() {		//输出算式
		int i = 0;
		for(Object object:set) {
			i++;
			System.out.print(object + "=" + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public void out() {			//输出结果
		for(int i = 1;i <= 50; i++ ) {
			System.out.println("第"+i+"道题答案为："+e[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Fifty ran = new Fifty();
		ran.suiji();
		ran.output();
		ran.out();
		
	}
}
