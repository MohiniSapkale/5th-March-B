package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// reading Whole Row(0),varry Column
		
		File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
//		for(int i=0; i<=3; i++)  //Static Coding for getting 1st row
//		{
//		String value = sheet.getRow(0).getCell(i).getStringCellValue();
//		System.out.print(value+ "  ");
//		}
		
		int LastRowNum = sheet.getLastRowNum();
		int totalRowCount = LastRowNum;
		System.out.println(totalRowCount);
		
		short LastCellNum = sheet.getRow(0).getLastCellNum();
		int totalCellCount = (LastCellNum-1);
		System.out.println(totalCellCount);
		
		for(int i=0; i<=totalCellCount;i++)  //dynamic Coding
		{
			String value = sheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+ " ");
		}
		

	}

}
