package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Fifty {
	static int a;static int b;		//��¼�����
	static char c;				//��¼����
//	static String []d = new String[51];		//��¼��ʽ
	static Set<String> set = new LinkedHashSet();		//��¼���ظ���ʽ  LinkedHashSet����˳��
	static int []e = new int[51];		//��¼���
	public void suiji() {	//���������������¼
		for(;set.size()<50;) {
			int i = set.size();			//��¼����
			do {
					a = (int)(Math.random()*100);
					b = (int)(Math.random()*100);
				}while((a + b > 100) || (a - b < 0));
			if((int)(Math.random()*100)%2 == 0) {		//���ƼӼ���
				c = '+';
				set.add(a+"+"+b);
				e[i] = a + b;
			}
			else {
				c = '-';
				set.add(a+"-"+b);
				e[i] = a - b;
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
		for(int i = 0;i < 50; i++ ) {
			System.out.println("��"+(i+1)+"�����Ϊ��"+e[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Fifty ran = new Fifty();
		ran.suiji();
		ran.output();
		System.out.println("\t\t\t\t"+"****�ο���****"+"\t\t\t\t");
		ran.out();
		
	}
}
