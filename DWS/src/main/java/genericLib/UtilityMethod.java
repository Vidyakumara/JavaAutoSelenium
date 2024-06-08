package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {

	public String getCurrentTime;

	public String getDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/prop.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	public String getDatafromExcelFile(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(".src/test/resources/testdata/exceldata.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sheet= wb.getSheet(sheetname);
	return sheet.getRow(rowNum).getCell(colNum).toString();

}
public static String getCurrentTime()
{
	LocalDateTime l= LocalDateTime.now();
	String name = l.toString().replace(":","-");
	return name;
}
}
