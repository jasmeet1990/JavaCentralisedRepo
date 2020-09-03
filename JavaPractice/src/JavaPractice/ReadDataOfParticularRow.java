package JavaPractice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataOfParticularRow {	
public static void main(String[] args) throws IOException {
	ReadDataOfParticularRow r = new ReadDataOfParticularRow();
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the row number for which you want to read the data");
	int n = scan.nextInt();
	r.ReadDataFromRow(n);
}
//This method is used to read data of a particular row
public void ReadDataFromRow(int RowNo) throws IOException {
	File f =new File("../JavaPractice/file1.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br =new BufferedReader(fr);
	String s =" ";
	int i = 1;
		while( i<=RowNo)
	{
		if(i==RowNo) {
			 s=	br.readLine();
			 System.out.println(s);
			
		}
				else {
				br.readLine();
		}
		 i++;
	}
	
		
}
}
