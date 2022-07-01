package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
		
		String Name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.print(Name1);
		
		String Name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println("  "+Name2);
		
		 double num1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		 System.out.print(num1);
		 
		 double num2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		 System.out.println("    "+num2);
		 
		 String batch1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
         System.out.print(batch1);
        
         String batch2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
         System.out.println("       "+batch2);
         
         boolean Result1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
         System.out.print(Result1);
         
         boolean Result2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
         System.out.println("   "+Result2);
	}

}
