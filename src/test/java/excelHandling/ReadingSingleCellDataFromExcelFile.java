package excelHandling;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingSingleCellDataFromExcelFile {
	@Test
	public void readExcelFile() throws Exception{
		String filepath="./excel/NameData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("name");
//		XSSFRow row = sheet.getRow(3);
//		XSSFCell cell = row.getCell(2);
//		String data = cell.toString();
		String data=workbook.getSheetAt(0).getRow(0).getCell(0).toString();
		workbook.close();
		System.out.println("Data: "+data);
	}
}
