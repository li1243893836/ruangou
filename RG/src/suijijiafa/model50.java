package suijijiafa;

public class model50 {

	static int a;static int b;		//��¼�����
	static char c;				//��¼����
	static String []d = new String[51];		//��¼��ʽ
	static int []e = new int[51];		//��¼���
	public void suiji(int i) {	//���������������¼
		do {
			a = (int)(Math.random()*100);
			b = (int)(Math.random()*100);
		}while((a+b>100)||(a-b<0));
		if((int)(Math.random()*100)%2==0) {		//���ƼӼ���
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
	
	public Boolean check(String d[],int i) {	//����Ƿ����Ҫ��
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
	
	public void output(int i) {		//�����ʽ
		
		System.out.print(d[i]+"="+"\t");
		if(i%5==0) {
			System.out.println();
		}
	}
	
	public void out(int i) {			//������
		
		System.out.println("��"+i+"�����Ϊ��"+e[i]);
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
