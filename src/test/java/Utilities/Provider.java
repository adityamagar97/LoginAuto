package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Provider {

	 @DataProvider(name = "loginData")
	public static Object[][] getexcel() throws IOException {
		
	
         DataFormatter df = new DataFormatter();
         FileInputStream file = new FileInputStream("/Users/adityamagar/Desktop/TNS /sheetingg.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheet("Adi");
         
         int GeRow = sheet.getLastRowNum();
         int GeCol = sheet.getRow(0).getLastCellNum();
         
         Object obj[][] =  new Object[GeRow][GeCol];
         for(int i=0;i<GeRow;i++) {
        	 
        	
        	 XSSFRow row = sheet.getRow(i+1);
   	 
        	 for( int j=0;j<GeCol;j++) {
        		 
        		 XSSFCell cello = row.getCell(j);
        		 obj[i][j] = df.formatCellValue(cello);  		 
        	 }
         }
         return obj;
         
	
	
	}
}
