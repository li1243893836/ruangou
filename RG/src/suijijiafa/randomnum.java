package suijijiafa;

public class randomnum {
	
	
	public static void main(String[] args) {
		int a=0;int b=0;	//��¼����
		char d;			//��¼�������
		int []c = new int[51];					//��¼���
		String []e = new String[51];
		int i;
		for(i=1;i<=50;i++) {
			a = (int) (Math.random()*100);		//���������������
			b = (int) (Math.random()*100);
			if(((int)(Math.random()*10))%2==0) {	//��������������ž��Ǽӣ������ż�������ž��Ǽ�
				d = '-';
			}
			else {
				d = '+';
			}
			int j;
			for(j=1;j<i;j++) {					//ʹ��������ͬ����
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
					i--;				//���Ƽӷ�������100
					continue;
				}
				System.out.print(a+"+"+b+"="+"\t");		//�����ʽ
				e[i]=a+"+"+b;
			}
			else if(d=='-') {
				c[i]=a-b;
				if(c[i]<0) {
					i--;				//���Ƽӷ���С��0
					continue;
				}
				e[i]=a+"-"+b;
				System.out.print(a+"-"+b+"="+"\t");
			}
			if(i%5==0) {
				System.out.println();           //ÿ���������
			}
		}
	
		for(i=1;i<=50;i++) {
			System.out.println("��"+i+"����Ĵ�Ϊ��"+c[i]);		//�����
		}
	}
}
