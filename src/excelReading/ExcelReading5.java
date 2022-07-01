package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
		int LastRowNum = sheet.getLastRowNum();  //get the total no of rows count
		int totalRowNum = LastRowNum;
		System.out.println(totalRowNum);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();   //get total no.of cell count
		int totalCellNum = lastCellNum-1;
		System.out.println(totalCellNum);

		for(int i=0; i<=totalRowNum;i++)
		{
			for(int j=0; j<=totalCellNum;j++)
			{
				String values = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(values+ " || ");
			}
			System.out.println( );
		}

	}

}
