package suijijiafa;

public class randomnum {
	
	
	public static void main(String[] args) {
		int a=0;int b=0;	//记录加数
		char d;			//记录随机符号
		int []c = new int[51];					//记录结果
		String []e = new String[51];
		int i;
		for(i=1;i<=50;i++) {
			a = (int) (Math.random()*100);		//产生两个随机加数
			b = (int) (Math.random()*100);
			if(((int)(Math.random()*10))%2==0) {	//如果是奇数，符号就是加，如果是偶数，符号就是减
				d = '-';
			}
			else {
				d = '+';
			}
			int j;
			for(j=1;j<i;j++) {					//使不出现相同算数
				if(e[j]==e[i]) {
					break;
				}
			}
			if(i!=j) {
				continue;
			}
			if(d=='+') {
				c[i]=a+b;
				if(c[i]>100) {
					i--;				//控制加法不大于100
					continue;
				}
				System.out.print(a+"+"+b+"="+"\t");		//输出算式
				e[i]=a+"+"+b;
			}
			else if(d=='-') {
				c[i]=a-b;
				if(c[i]<0) {
					i--;				//控制加法不小于0
					continue;
				}
				e[i]=a+"-"+b;
				System.out.print(a+"-"+b+"="+"\t");
			}
			if(i%5==0) {
				System.out.println();           //每五个数换行
			}
		}
	
		for(i=1;i<=50;i++) {
			System.out.println("第"+i+"道题的答案为："+c[i]);		//输出答案
		}
	}
}
