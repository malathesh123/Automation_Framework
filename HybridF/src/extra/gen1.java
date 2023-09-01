package extra;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gen1 {
	public static String ddt(String a,int b,int c) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./excel/Book2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(a);
		Row rw = sheet.getRow(b);
		Cell cell = rw.getCell(c);
		String val = cell.getStringCellValue();
		return val;
	}

}
