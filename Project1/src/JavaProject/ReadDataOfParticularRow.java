package JavaProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataOfParticularRow {
		

	public static void main(String[] args) throws IOException {
		ReadDataOfParticularRow r = new ReadDataOfParticularRow();
		r.ReadDataFromRow(2);
	}

	//This method is used to read data of a particular row
	
	public void ReadDataFromRow(int RowNo) throws IOException {
		File f =new File("../Project1/src/JavaProject/FileRow.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		for(int i=1;i==RowNo;i++)
		{
			br.readLine();
			
		}
}
}
