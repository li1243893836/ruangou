package suijijiafa;

public class randomnum1 {
	
	static int a=0;		//��¼����
	static int b=0;
	static char d;			//��¼�������
	static int []c = new int[51];					//��¼���
	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			a = (int) (Math.random()*100);		//���������������
			b = (int) (Math.random()*100);
			if(((int)(Math.random()*10))%2==0) {	//��������������ž��Ǽӣ������ż�������ž��Ǽ�
				d = '-';
			}
			else {
				d = '+';
			}
			if(d=='+') {
				System.out.print(a+"+"+b+"="+"\t");		//�����ʽ
				c[i]=a+b;
			}
			else if(d=='-') {
				System.out.print(a+"-"+b+"="+"\t");
				c[i]=a-b;
			}
			if(i%5==0) {
				System.out.println();           //ÿ���������
			}
		}
	
		for(int i=1;i<=50;i++) {
			System.out.println("��"+i+"����Ĵ�Ϊ��"+c[i]);		//�����
		}
	}
}
