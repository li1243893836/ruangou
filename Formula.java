package suijijiafa;

import java.util.LinkedHashSet;
import java.util.Set;

public class Formula {

	public static int RandomNum1;static int RandomNum2;		//��¼�����
	public static char Symbol;				//��¼����
	public static Set<String> set = new LinkedHashSet();		//��¼���ظ���ʽ  LinkedHashSet����˳��
	public static int []Result = new int[51];		//��¼���
	
	
	public void FormulaSet(int i){		//���������������¼
		do {											//ʹ��ʽ�Ľ��������100����С��0
				RandomNum1 = (int)(Math.random()*100);
				RandomNum2 = (int)(Math.random()*100);
			}while((RandomNum1 + RandomNum2 > 100) || (RandomNum1 - RandomNum2 < 0));
		if((int)(Math.random()*100)%2 == 0) {		//���ƼӼ���
			Symbol = '+';
			set.add(RandomNum1+"+"+RandomNum2);			//д����ʽ
			Result[i] = RandomNum1 + RandomNum2;		//��¼��ʽ���
		}
		else {
			Symbol = '-';
			set.add(RandomNum1 + "-" + RandomNum2);
			Result[i] = RandomNum1 - RandomNum2;
		}
	}
	
	
	
	
}
