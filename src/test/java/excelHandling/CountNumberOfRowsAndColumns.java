package excelHandling;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CountNumberOfRowsAndColumns {
	@Test
	public void readExcelFile() throws Exception{
		String filepath="./excel/NameData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int cols=workbook.getSheet("Political").getRow(0).getLastCellNum();
		int rows=workbook.getSheet("Political").getPhysicalNumberOfRows();
		workbook.close();
		System.out.println("Number of Columns: "+cols);
		System.out.println("Number of Rows: "+rows);
	}
}
