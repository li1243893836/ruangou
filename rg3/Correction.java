package com.itly.rg3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;


public class Correction {

	public String inPath="D:\\加法习题集\\加法习题1.csv";
	public String inPath1="D:\\加法习题集\\加法习题答案1.csv";
	public String outPath="D:\\批改文件.csv";
	public ArrayList<String []> List = new ArrayList<String[]>();
	public ArrayList<String []> List1 = new ArrayList<String[]>();
	static int mark = 0 ;
	private void CheckandCreateFile(){

		File file=new File(outPath);
		try{
			if(!file.exists()){
				file.createNewFile();
				System.out.println("文件不存在，新建成功！");
			}
			else{
				System.out.println("文件存在！");
			}
		}catch( Exception e){
			e.printStackTrace();
		}
	}

	public void ReadCSV() throws IOException {

		CsvReader reader = new CsvReader(inPath,',', Charset.forName("gb2312"));
		CsvReader reader1 = new CsvReader(inPath1,',', Charset.forName("gb2312"));
		reader.readHeaders();
		while(reader.readRecord()) {
			List.add(reader.getValues());
		}
		reader.close();
		while(reader1.readRecord()) {
			List1.add(reader1.getValues());
		}
		reader1.close();
		for (int row = 0;row < List.size(); row++) {
			int Length=List.get(row).length;
			int Length1=List1.get(row).length;
			if(Length > 0 && Length1 > 0){
				for(int i=0;i<Length;i+=2){		
					if(List.get(row)[i].equals(List1.get(row+1)[i])) {
						if(List.get(row)[i+1].equals(List1.get(row+1)[i+1])) {
							List.get(row)[i+1] = "true" ;
							mark += 2;
						}
						else {
							List.get(row)[i+1] = "false" ;
						}
					}
					else {
						List.get(row)[i+1] = "false" ;
					}
				}
			}

		}

	}
	public void WriteCSV()	throws IOException{
		Correction IO=new Correction();
		IO.CheckandCreateFile();
		CsvWriter wr = new CsvWriter(outPath,',', Charset.forName("gb2312"));
		String[] header = {"习题","答案","习题","答案","习题","答案","习题","答案","习题","答案"};
		wr.writeRecord(header);
		for(int i=0;i<List.size();i++)
		{
			String[] Data= List.get(i);
			wr.writeRecord(Data);
		}
		wr.write("本次练习总得分：" + mark + "再接再厉，继续努力！！！");
		wr.close();
	}
	public static void main( String args[]) throws IOException{
		Correction IO=new Correction();
		IO.ReadCSV();
		IO.WriteCSV();
	}
}
