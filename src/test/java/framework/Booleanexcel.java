package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Booleanexcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\ethin\\Documents\\Boolean.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Boolean data = wb.getSheet("Sheet1").getRow(0).getCell(0).getBooleanCellValue();
		System.out.println(data);
		System.out.println("its my first program");
	}

}
