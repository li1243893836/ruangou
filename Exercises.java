package suijijiafa;

public class Exercises {
	
	Formula ran = new Formula();
	
	//输出算式的结果
	public void outputResult() {
		int i = 0;
		for(i = 0;i < 50;i++) {
			System.out.println("第"+(i+1)+"道题的答案为："+Formula.Result[i]+"\t\t");
			
		}
	}
	
	
	
	//检查算式是否重复
	public void Check() {
		int j=0;
		String Temp1 = "Formula.RandomNum1" + Formula.Symbol + "Formula.RandomNum2";		//记录本次产生的随机算式
		for(Object object1:Formula.set) {									//去除那些类似1+3、3+1的重复算式
			j++;
			String Temp = "Formula.RandomNum2" + Formula.Symbol + "Formula.RandomNum1";		//记录与本次产生的随机算式相反算式
			if(Temp == object1) {
				break;
			}
		}
		if(j != Formula.set.size()) {								//j!=当前大小说明，有重复，remove现在的算式
			Formula.set.remove(Temp1);
		}
	}
	//输出算式
	public void outputExe() {
		
		int i = 0;
		for(i = 0; i < 50 ;i++) {						//生成算式
			ran.FormulaSet(i);
			Check();
		
			}
	}
	public void genFormula() {
		int i = 0;
		for(Object object:Formula.set) {				//输出算式
			i++;
			System.out.print(object + "=" + "\t\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
}
