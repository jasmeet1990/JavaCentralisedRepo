package JavaPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDatafromExcelCell {

	public static void main(String[] args) throws BiffException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row No");
		int row = scan.nextInt();
		System.out.println("Enter the column No");
		int column = scan.nextInt();
		ReadDatafromExcelCell re = new ReadDatafromExcelCell();
		re.ReadDataCell(row, column);
	}

	public static void ReadDataCell(int rowNo, int columnNo) throws BiffException, IOException {
		File f = new File("C:\\Users\\JASMEET KAUR\\Desktop\\Test Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		Cell c1 = ws.getCell(columnNo, rowNo);
		System.out.println("Value of cell is "+c1.getContents());

	}

}
