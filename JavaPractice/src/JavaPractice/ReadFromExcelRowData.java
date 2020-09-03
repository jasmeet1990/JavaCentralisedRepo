package JavaPractice;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadFromExcelRowData {

	public static void main(String[] args) throws BiffException, IOException {
		File f =new File("C:\\Users\\JASMEET KAUR\\Desktop\\Test Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int r =ws.getRows();
		int c = ws.getColumns();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				Cell c1= ws.getCell(j, i);
				System.out.println(c1.getContents());
			}
		}
		

	}

}
