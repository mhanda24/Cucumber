package DataLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataMapper {
	public static HashMap<String,String> storeValues = new HashMap();
	public static List<HashMap<String, String>> datamap(String filePath, String sheetName){

		List<HashMap<String, String>> myData = new ArrayList<>();	

		try {
			FileInputStream fIn = new FileInputStream(filePath);
			XSSFWorkbook wBook = new XSSFWorkbook(fIn);
			XSSFSheet sheet = wBook.getSheet(sheetName);

			Row HeaderRow = sheet.getRow(0);
			//System.out.println(sheet.getPhysicalNumberOfRows());
			HashMap<String,String> currentHash = new HashMap<String,String>();

			for (int i=1;i<sheet.getPhysicalNumberOfRows();i++){
				Row currentRow = sheet.getRow(i);
				for(int j=0; j<currentRow.getPhysicalNumberOfCells();j++){
					Cell currentCell = currentRow.getCell(j);

					switch(currentCell.getCellType()){
					case Cell.CELL_TYPE_STRING:
						//System.out.println(currentCell.getStringCellValue());
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					}

				}myData.add(currentHash);
				System.out.println(myData);
			}fIn.close();

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return myData;
	}




}


