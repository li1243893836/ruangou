package suijijiafa;

public class randomnum1 {
	
	static int a=0;		//记录加数
	static int b=0;
	static char d;			//记录随机符号
	static int []c = new int[51];					//记录结果
	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			a = (int) (Math.random()*100);		//产生两个随机加数
			b = (int) (Math.random()*100);
			if(((int)(Math.random()*10))%2==0) {	//如果是奇数，符号就是加，如果是偶数，符号就是减
				d = '-';
			}
			else {
				d = '+';
			}
			if(d=='+') {
				System.out.print(a+"+"+b+"="+"\t");		//输出算式
				c[i]=a+b;
			}
			else if(d=='-') {
				System.out.print(a+"-"+b+"="+"\t");
				c[i]=a-b;
			}
			if(i%5==0) {
				System.out.println();           //每五个数换行
			}
		}
	
		for(int i=1;i<=50;i++) {
			System.out.println("第"+i+"道题的答案为："+c[i]);		//输出答案
		}
	}
}
