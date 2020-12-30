package excelHandling;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingAllOddDataFromExcelFile {
	@Test
	public void readExcelFile() throws Exception{
		String filepath="./excel/NameData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		String data="";
		int rows=workbook.getSheet("name").getPhysicalNumberOfRows();
//		int cols=workbook.getSheet("name").getRow(0).getLastCellNum();//4
		for(int r=0;r<rows;r++) {
			for(int c=0;c<workbook.getSheet("name").getRow(r).getLastCellNum();c++) {
				data=workbook.getSheet("name").getRow(r).getCell(c).toString();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		workbook.close();
//		System.out.println("Data: "+data);
	}
}
