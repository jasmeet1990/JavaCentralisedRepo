package JavaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class ReadDataofRowRange {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the row range for which you want to read the data");
		System.out.println("Please enter the Initial row");
		int s=scan.nextInt();
		System.out.println("Please enter the final row");
		int e = scan.nextInt();
		ReadDataofRowRange r =new ReadDataofRowRange();
		r.ReadRowRange(s, e);
		
	}
 public void ReadRowRange(int start,int end) throws IOException {
	 File f = new File("../JavaPractice/file1.txt");
	 FileReader fr = new FileReader(f);

	 BufferedReader br = new BufferedReader(fr);
	 	String s="";
	 	int i=1;
	 while (i<=end) {
		 if(i>start && i<end) {
			 s=br.readLine();
	 System.out.println(s);
		 }
		 else {
			 br.readLine();
		 }
		 i++;
	 }
	 	 }
	 
 }

