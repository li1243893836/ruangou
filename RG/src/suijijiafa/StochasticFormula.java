package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class StochasticFormula {
	static int RandomNum1;static int RandomNum2;		//��¼�����
	static char Symbol;				//��¼����
//	static String []d = new String[51];		//��¼��ʽ
	static Set<String> set = new LinkedHashSet();		//��¼���ظ���ʽ  LinkedHashSet����˳��
	static int []Result = new int[51];		//��¼���
	public void FormulaSet() {	//���������������¼
		for(;set.size()<50;) {
			int i = set.size();			//��¼����
			do {
				RandomNum1 = (int)(Math.random()*100);
				RandomNum2 = (int)(Math.random()*100);
				}while((RandomNum1 + RandomNum2 > 100) || (RandomNum1 - RandomNum2 < 0));
			if((int)(Math.random()*100)%2 == 0) {		//���ƼӼ���
				Symbol = '+';
				set.add(RandomNum1+"+"+RandomNum2);
				Result[i] = RandomNum1 + RandomNum2;
			}
			else {
				Symbol = '-';
				set.add(RandomNum1 + "-" + RandomNum2);
				Result[i] = RandomNum1 - RandomNum2;
			}
			
		}
	}
	
	
	public void OutputFormula() {		//�����ʽ
		int i = 0;
		for(Object object:set) {
			i++;
			System.out.print(object + "=" + "\t\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public void OutputResult() {			//������
		for(int i = 0;i < 50; i++ ) {
			System.out.println("��" + (i + 1) + "�����Ϊ��" + Result[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		StochasticFormula ran = new StochasticFormula();
		ran.FormulaSet();
		ran.OutputFormula();
		System.out.println("\t\t\t\t"+"****�ο���****"+"\t\t\t\t");
		ran.OutputResult();
		
	}
}
