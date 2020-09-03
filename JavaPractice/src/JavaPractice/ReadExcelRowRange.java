package JavaPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelRowRange {
	public static void main(String[] args) throws BiffException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter initial row no");
		int s = scan.nextInt();
		System.out.println("Enter final row no");
		int e = scan.nextInt();
		ReadExcelRowRange rd = new ReadExcelRowRange();
		rd.ReadExcelRowRange(s, e);
	}
	public void ReadExcelRowRange(int startrow, int endrow) throws BiffException, IOException {
		File f = new File("C:\\Users\\JASMEET KAUR\\Desktop\\Test Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		for (int i = startrow; i < endrow; i++) {
			for (int j = 0; j < c; j++) {
				Cell c1 = ws.getCell(j, i);
				System.out.print(c1.getContents() + " ");
			}
			System.out.println();
		}
	}
}
