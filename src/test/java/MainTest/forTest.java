package MainTest;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import DataLoader.DataMapper;

public class forTest {

	public static void main(String[] args) throws IOException {
		
		List<HashMap<String,String>> h1 = DataLoader.DataHelper.data("C:\\seleniumIO\\TestData.xlsx","Sheet1");
		
		for(HashMap<String,String> h2 : h1){
			System.out.println("Key --" + h2.keySet());
			System.out.println("Value are " + h2.values());
		}
		
	}

}
