package suijijiafa;

public class Exercises {
	
	Formula ran = new Formula();
	
	//�����ʽ�Ľ��
	public void outputResult() {
		int i = 0;
		for(i = 0;i < 50;i++) {
			System.out.println("��"+(i+1)+"����Ĵ�Ϊ��"+Formula.Result[i]+"\t\t");
			
		}
	}
	
	
	
	//�����ʽ�Ƿ��ظ�
	public void Check() {
		int j=0;
		String Temp1 = "Formula.RandomNum1" + Formula.Symbol + "Formula.RandomNum2";		//��¼���β����������ʽ
		for(Object object1:Formula.set) {									//ȥ����Щ����1+3��3+1���ظ���ʽ
			j++;
			String Temp = "Formula.RandomNum2" + Formula.Symbol + "Formula.RandomNum1";		//��¼�뱾�β����������ʽ�෴��ʽ
			if(Temp == object1) {
				break;
			}
		}
		if(j != Formula.set.size()) {								//j!=��ǰ��С˵�������ظ���remove���ڵ���ʽ
			Formula.set.remove(Temp1);
		}
	}
	//�����ʽ
	public void outputExe() {
		
		int i = 0;
		for(i = 0; i < 50 ;i++) {						//������ʽ
			ran.FormulaSet(i);
			Check();
		
			}
	}
	public void genFormula() {
		int i = 0;
		for(Object object:Formula.set) {				//�����ʽ
			i++;
			System.out.print(object + "=" + "\t\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
}
