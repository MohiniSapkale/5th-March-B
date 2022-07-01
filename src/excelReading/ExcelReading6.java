package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
		Sheet sheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		int totalRowNum = sheet.getLastRowNum();
		System.out.println(totalRowNum);
		int totalCellNum = sheet.getRow(totalRowNum).getLastCellNum()-1;
		System.out.println(totalCellNum);
		
		
		for(int i=0;i<=totalRowNum;i++)
		{
			for(int j=0; j<=totalCellNum; j++)
			{
				Cell cell = sheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();
				
				if(type == CellType.STRING)
				{
					System.out.print(cell.getStringCellValue()+ " || ");
				}
				else if(type == CellType.BOOLEAN)
				{
					System.out.print(cell.getBooleanCellValue()+" || ");
				}
				else if(type == CellType.NUMERIC)
				{
					System.out.print(cell.getNumericCellValue()+" || ");
				}
				
			}
			System.out.println();
			
		}
		

	}

}
