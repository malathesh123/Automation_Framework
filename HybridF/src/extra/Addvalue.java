package extra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Addvalue {
 
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			FileInputStream fis=new FileInputStream("./excel/Book2.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.createSheet("selinium");
		    //Row row = sheet.createRow(3);
			//Cell cell = row.createCell(1);
			//cell.setCellValue("xcvbnm");
			FileOutputStream fio=new FileOutputStream("./excel/Book2.xlsx");
			book.write(fio);
	}
}

