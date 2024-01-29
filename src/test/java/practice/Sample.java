package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\ethin\\Documents\\Jaya.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}
}
