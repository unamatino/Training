package excelHandling;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingAllDataFromExcelFile {
	@Test
	public void readExcelFile() throws Exception{
		String filepath="./excel/NameData.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		String data="";
		
		for(int r=0;r<8;r++) {
			for(int c=0;c<3;c++) {
				data=workbook.getSheet("Political").getRow(r).getCell(c).toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
					
		workbook.close();
	}
}
