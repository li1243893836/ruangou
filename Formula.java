package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Formula {

	public static int random1;static int random2;		//��¼�����
	public static char symbol;				//��¼����
	public static Set<String> set = new LinkedHashSet();		//��¼���ظ���ʽ  LinkedHashSet����˳��
	public static int []result = new int[51];		//��¼���
	
	
	public void FormulaSet(int i){		//���������������¼
		do {											//ʹ��ʽ�Ľ��������100����С��0
				random1 = (int)(Math.random()*100);
				random2 = (int)(Math.random()*100);
			}while((random1 + random2 > 100) || (random1 - random2 < 0));
		if((int)(Math.random()*100)%2 == 0) {		//���ƼӼ���
			symbol = '+';
			set.add(RandomNum1+"+"+RandomNum2);			//д����ʽ
			result[i] = random1 + random2;		//��¼��ʽ���
		}
		else {
			symbol = '-';
			set.add(random1 + "-" + random2);
			result[i] = random1 - random2;
		}
	}
	
	
	
	
}
