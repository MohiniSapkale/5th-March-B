package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Separate Method and read excel 1st row 1st cell (0,0)
		File MyFile = new File("D:\\5th march batch\\MyFile.xlsx");
		Workbook file = WorkbookFactory.create(MyFile);
        Sheet sheet = file.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        CellType type = cell.getCellType();
        System.out.println(type);
        String Name = cell.getStringCellValue();
        System.out.println(Name);
	}

}
