package suijijiafa;

import java.util.HashSet;
import java.util.Set;

public class Fifty {

	static int a;static int b;		//��¼�����
	static char c;				//��¼����
//	static String []d = new String[51];		//��¼��ʽ
	Set<String> set = new HashSet();		//��¼���ظ���ʽ
	static int []e = new int[51];		//��¼���
	public void suiji() {	//���������������¼
		for(int i = 1;i <= 50;i++) {
			do {
					a = (int)(Math.random()*100);
					b = (int)(Math.random()*100);
				}while((a + b > 100) || (a - b < 0));
			if((int)(Math.random()*100)%2 == 0) {		//���ƼӼ���
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
	
	
	public void output() {		//�����ʽ
		int i = 0;
		for(Object object:set) {
			i++;
			System.out.print(object + "=" + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public void out() {			//������
		for(int i = 1;i <= 50; i++ ) {
			System.out.println("��"+i+"�����Ϊ��"+e[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Fifty ran = new Fifty();
		ran.suiji();
		ran.output();
		ran.out();
		
	}
}
