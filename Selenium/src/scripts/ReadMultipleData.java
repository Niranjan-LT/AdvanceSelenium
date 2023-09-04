package scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void getData(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\QSPR\\Desktop\\Testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet shet = book.getSheet(sheet);
		
		int actual_row = shet.getPhysicalNumberOfRows();
		
		for(int i=1;i<actual_row;i++)
		{
			Row row = shet.getRow(i);
			
			int actual_cell = row.getPhysicalNumberOfCells();
			//System.out.println(actual_cell);
			for(int j=0;j<actual_cell;j++)
			{
				String value = row.getCell(j).toString();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		getData("Sheet1");
	}

}
