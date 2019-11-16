package com.itly.rg2;

import java.util.LinkedHashSet;


/**类描述：习题集类
 *@author: ly
 *@date： 日期：2019/11/15 时间：2019年11月15日18:41:57
 *@version 2.0
 *修改时间：2019年11月16日09:46:27
 *修改内容：注释
 */


public class CountExercise {
	
	int []result1 = new int[101];		//三个数组分别存储加法算式、减法算式、加减法混合算式的结果
	int []result2 = new int[101];
	int []result3 = new int[101];
	
	
	//三个数组分别存储加法算式、减法算式、加减法混合算式的算式
	static LinkedHashSet<String> set1 =new LinkedHashSet<String>();		
	static LinkedHashSet<String> set2 =new LinkedHashSet<String>();
	static LinkedHashSet<String> set3 =new LinkedHashSet<String>();
	
	
	/*
	 * 加法
	 */
	 
	
	//产生加法算式集合
	public  void Addition(int num) {
		AddFormula ad = new AddFormula();	//创建对象
		for(int i = 0; i < num ; i++) {
			set1.add(String.valueOf(ad.Formula().iterator().next()));	//把生成的随机算式存储到集合中
		}

	}
	//输出加法算式
	public  void outAdd() {
		int i = 0;
		String str1 = new String() ;	//存储数字
		String str2 = new String() ;
		for(String st : set1) {
			
			str1 = st.substring(0,st.indexOf('+'));					//把生成的算式拆分，存储第一个数字
			str2 = st.substring(st.indexOf('+')+1,st.length()-1);	//把生成的算式拆分，存储第二个数字
			result1[i] = Integer.parseInt(str1) + Integer.parseInt(str2);	//记录结果
			System.out.print((i + 1) + " : " + st+"\t");
			i++;
			if(i % 5 == 0) {		//按一定格式显示
				System.out.println();
			}
		}
	}
	
	//输出结果
	public void outAddResult() {
		System.out.println();
		System.out.println("-----------------------华丽的分割线-----------------------");
		for(int i = 0 ; i <  set1.size(); i++) {
			System.out.println("第" + (i + 1) + "道题的答案为：" + result1[i]);		//纯属生成答案
		}
	}
	
	/*
	 * 减法
	 */
	
	/*
	 * 以下代码跟上面的注释差不多，就不再添加了，应该都能看的懂
	 */
	//产生减法算式集合
	public  void Subtraction(int num) {
		SubFormula ad = new SubFormula();
		for(int i = 0; i < num ; i++) {
			set2.add(String.valueOf(ad.Formula().iterator().next()));
		}

	}
	//输出减法算式
	public  void outSub() {
		int i = 0;
		String str1 = new String() ;
		String str2 = new String() ;
		for(String st : set2) {
			
			str1 = st.substring(0,st.indexOf('-'));
			str2 = st.substring(st.indexOf('-')+1,st.length()-1);
			result2[i] = Integer.parseInt(str1) - Integer.parseInt(str2);
			System.out.print((i + 1) + " : " + st+"\t");
			i++;
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	//输出结果
	public void outSubResult() {
		System.out.println("-----------------------华丽的分割线-----------------------");
		for(int i = 0 ; i <  set2.size(); i++) {
			System.out.println("第" + (i + 1) + "道题的答案为：" + result2[i]);
		}
	}
	
	/*
	 * 加减混合
	 */
	
	//产生加减混合算式集合
		public  void AddandSub(int num) {
			AddFormula ad = new AddFormula();
			SubFormula ad1 = new SubFormula();
			for(int i = 0; i < num ; i++) {
				if((int)(Math.random()*10001) % 2 == 0) {	//使数据足够大，这样全是+，或-的概率就减小了
					set3.add(String.valueOf(ad.Formula().iterator().next()));
				}
				else
				{
					set3.add(String.valueOf(ad1.Formula().iterator().next()));
				}
			}

		}
		
		
		//输出加减混合算式
		public  void outAddSub() {
			int i = 0;
			String str1 = new String() ;
			String str2 = new String() ;
			Boolean flag = null ;
			for(String st : set3) {
				char []stringArr = st.toCharArray();	//记录算式符号，方便加减
				for(int j = 0 ; j < stringArr.length ;j++) {
					if(stringArr[j] == '+') {
						flag = true;
						break;
					}
					if(stringArr[j] == '-'){
						flag = false;
						break;
					}
				}
				if(flag == true) {
					str1 = st.substring(0,st.indexOf('+'));
					str2 = st.substring(st.indexOf('+')+1,st.length()-1);
					result3[i] = Integer.parseInt(str1) + Integer.parseInt(str2);
				}
				else if(flag == false){
					str1 = st.substring(0,st.indexOf('-'));
					str2 = st.substring(st.indexOf('-')+1,st.length()-1);
					result3[i] = Integer.parseInt(str1) - Integer.parseInt(str2);
					
				}
				
				System.out.print((i + 1) + " : " + st+"\t");
				i++;
				if(i % 5 == 0) {
					System.out.println();
				}
			}
		}
		
		//输出结果
		public void outAddSubResult() {
			System.out.println("-----------------------华丽的分割线-----------------------");
			for(int i = 0 ; i <  set3.size(); i++) {
				System.out.println("第" + (i + 1) + "道题的答案为：" + result3[i]);
			}
		}
}
