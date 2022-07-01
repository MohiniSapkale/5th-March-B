package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		// reading Whole Column(2),varry Row
		
				File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
				Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
				
				//I want to read one column
				
//				for(int i=0;i<=3;i++)  //static coding
//				{
//					String value = sheet.getRow(i).getCell(2).getStringCellValue();
//					System.out.println(value);
//				}
				
				//use dynamic Coding
				
				int LastRowNum = sheet.getLastRowNum();
				int totalRowNum = LastRowNum;
				System.out.println(totalRowNum);
				
				for(int i=0; i<=totalRowNum; i++)
				{
					String value = sheet.getRow(i).getCell(2).getStringCellValue();
					System.out.println(value);
				}
				

	}

}
