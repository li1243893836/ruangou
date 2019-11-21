package com.itly.rg2.v;

import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class Generate {
	
	//输出随机算式
		public void OutForm(Map<String,Integer> map) {
			int i = 0;
			Set<Entry<String,Integer>> set = map.entrySet();
			//输出随机算式
			for(Entry<String,Integer> entry : set) {

				System.out.print((i + 1) + ":" + entry.getKey() +" \t");

				//每五个算式为一行
				if((i + 1) % 5 == 0) {
					System.out.println();
				}
				i++;
			}

		}

		//输出随机算式的答案
		public void OutAnser(Map<String,Integer> map) {
			int i = 0;
			Set<Entry<String,Integer>> set = map.entrySet();
			//输出随机算式
			System.out.println();
			System.out.println("--------------------------华丽的分割线-------------------------------------");
			for(Entry<String,Integer> entry : set) {

				System.out.print((i + 1) + ":" + entry.getValue() +" \t\t");

				//每五个答案为一行
				if((i + 1) % 5 == 0) {
					System.out.println();
				}
				i++;
			}
		}


}
