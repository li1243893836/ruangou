package com.itly.rg2;

import java.util.LinkedHashSet;


/**��������ϰ�⼯��
 *@author: ly
 *@date�� ���ڣ�2019/11/15 ʱ�䣺2019��11��15��18:41:57
 *@version 2.0
 *�޸�ʱ�䣺2019��11��16��09:46:27
 *�޸����ݣ�ע��
 */


public class CountExercise {
	
	int []result1 = new int[101];		//��������ֱ�洢�ӷ���ʽ��������ʽ���Ӽ��������ʽ�Ľ��
	int []result2 = new int[101];
	int []result3 = new int[101];
	
	
	//��������ֱ�洢�ӷ���ʽ��������ʽ���Ӽ��������ʽ����ʽ
	static LinkedHashSet<String> set1 =new LinkedHashSet<String>();		
	static LinkedHashSet<String> set2 =new LinkedHashSet<String>();
	static LinkedHashSet<String> set3 =new LinkedHashSet<String>();
	
	
	/*
	 * �ӷ�
	 */
	 
	
	//�����ӷ���ʽ����
	public  void Addition(int num) {
		AddFormula ad = new AddFormula();	//��������
		for(int i = 0; i < num ; i++) {
			set1.add(String.valueOf(ad.Formula().iterator().next()));	//�����ɵ������ʽ�洢��������
		}

	}
	//����ӷ���ʽ
	public  void outAdd() {
		int i = 0;
		String str1 = new String() ;	//�洢����
		String str2 = new String() ;
		for(String st : set1) {
			
			str1 = st.substring(0,st.indexOf('+'));					//�����ɵ���ʽ��֣��洢��һ������
			str2 = st.substring(st.indexOf('+')+1,st.length()-1);	//�����ɵ���ʽ��֣��洢�ڶ�������
			result1[i] = Integer.parseInt(str1) + Integer.parseInt(str2);	//��¼���
			System.out.print((i + 1) + " : " + st+"\t");
			i++;
			if(i % 5 == 0) {		//��һ����ʽ��ʾ
				System.out.println();
			}
		}
	}
	
	//������
	public void outAddResult() {
		System.out.println();
		System.out.println("-----------------------�����ķָ���-----------------------");
		for(int i = 0 ; i <  set1.size(); i++) {
			System.out.println("��" + (i + 1) + "����Ĵ�Ϊ��" + result1[i]);		//�������ɴ�
		}
	}
	
	/*
	 * ����
	 */
	
	/*
	 * ���´���������ע�Ͳ�࣬�Ͳ�������ˣ�Ӧ�ö��ܿ��Ķ�
	 */
	//����������ʽ����
	public  void Subtraction(int num) {
		SubFormula ad = new SubFormula();
		for(int i = 0; i < num ; i++) {
			set2.add(String.valueOf(ad.Formula().iterator().next()));
		}

	}
	//���������ʽ
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
	
	//������
	public void outSubResult() {
		System.out.println("-----------------------�����ķָ���-----------------------");
		for(int i = 0 ; i <  set2.size(); i++) {
			System.out.println("��" + (i + 1) + "����Ĵ�Ϊ��" + result2[i]);
		}
	}
	
	/*
	 * �Ӽ����
	 */
	
	//�����Ӽ������ʽ����
		public  void AddandSub(int num) {
			AddFormula ad = new AddFormula();
			SubFormula ad1 = new SubFormula();
			for(int i = 0; i < num ; i++) {
				if((int)(Math.random()*10001) % 2 == 0) {	//ʹ�����㹻������ȫ��+����-�ĸ��ʾͼ�С��
					set3.add(String.valueOf(ad.Formula().iterator().next()));
				}
				else
				{
					set3.add(String.valueOf(ad1.Formula().iterator().next()));
				}
			}

		}
		
		
		//����Ӽ������ʽ
		public  void outAddSub() {
			int i = 0;
			String str1 = new String() ;
			String str2 = new String() ;
			Boolean flag = null ;
			for(String st : set3) {
				char []stringArr = st.toCharArray();	//��¼��ʽ���ţ�����Ӽ�
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
		
		//������
		public void outAddSubResult() {
			System.out.println("-----------------------�����ķָ���-----------------------");
			for(int i = 0 ; i <  set3.size(); i++) {
				System.out.println("��" + (i + 1) + "����Ĵ�Ϊ��" + result3[i]);
			}
		}
}
