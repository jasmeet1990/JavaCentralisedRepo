package JavaPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelDataRow {

	public static void main(String[] args) throws BiffException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row number to read excel");
		int n = scan.nextInt();
		ReadExcelDataRow read =  new ReadExcelDataRow();
		read.ReadRowData(n);
	}

	
	public   void ReadRowData(int rowNo) throws BiffException, IOException {
		File f =new File("C:\\Users\\JASMEET KAUR\\Desktop\\Test Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int c =ws.getColumns();
			for(int j=0;j<c;j++) {
				Cell c1 = ws.getCell(j, rowNo);
			System.out.print(c1.getContents()+" ");	
			}

		
	}
}
