package suijijiafa;

public class model50 {

	static int a;static int b;		//记录随机数
	static char c;				//记录符号
	static String []d = new String[51];		//记录算式
	static int []e = new int[51];		//记录结果
	public void suiji(int i) {	//产生随机数，并记录
		do {
			a = (int)(Math.random()*100);
			b = (int)(Math.random()*100);
		}while((a+b>100)||(a-b<0));
		if((int)(Math.random()*100)%2==0) {		//控制加减法
			c='+';
			e[i]=a+b;
			d[i]=a+"+"+b;
		}
		else {
			c='-';
			e[i]=a-b;
			d[i]=a+"-"+b;
		}
	}
	
	public Boolean check(String d[],int i) {	//检查是否符合要求
		int j;
		for( j = 1;j<i;j++) {
			if(d[j]==d[i]) {
				break;
			}
		}
		if(i!=j) {
			return false;
		}
		return true;
	}
	
	public void output(int i) {		//输出算式
		
		System.out.print(d[i]+"="+"\t");
		if(i%5==0) {
			System.out.println();
		}
	}
	
	public void out(int i) {			//输出结果
		
		System.out.println("第"+i+"道题答案为："+e[i]);
	}
	
	
	
	
	public static void main(String[] args) {
		model50 ran = new model50();
		for(int i=1;i<=50;i++) {
			if(!ran.check(d, i)) {
				i--;
			}
			else {
				ran.suiji(i);
				ran.output(i);
			}
			
		}
		for(int i=1;i<=50;i++) {
			ran.out(i);
		}
	}
}
