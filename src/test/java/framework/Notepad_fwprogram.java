package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Notepad_fwprogram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\ethin\\Documents\\framework.properties");
		Properties p=new Properties();
		p.load(fis);
		String username=p.getProperty("un");
		String password=p.getProperty("pwd");
		String chrome=p.getProperty("browser");
		System.out.println("un");
		System.out.println("pwd");
		System.out.println("browser");



	}

}
