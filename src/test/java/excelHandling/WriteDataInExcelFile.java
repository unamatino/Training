package excelHandling;

import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataInExcelFile {
	@Test
	public void writeData() throws Exception {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Employee Info");
		Object empData[][]= {
				{"EmpID","Name","Job"},
				{101,"David","Tester"},
				{102,"Miller","Developer"},
				{103,"Steve","PO"},
				{104,"Smith","Analyst"},
				{105,"Eoin","Manager"},
				{106,"Morgan","Dev. Lead"},
				{107,"Warner","Director"}
		};
//		Using Normal for loop -- 8 rows and 3 columns
//		[ [1,2,3],[5,6,7],[ a,b,c], [e,f,g], ]
//		empData.length=4=Number of rows
//		empData[0].length=3=Number of Columns
		int rows=empData.length;
		int cols=empData[0].length;
		System.out.println("Number of Rows: "+rows);
		System.out.println("Number of Columns: "+cols);
		for(int r=0;r<rows;r++) {
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell = row.createCell(c);
				Object value = empData[r][c];
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		Date date=new Date();
		String filepath="./excel/"+date+"_employee.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		workbook.write(fos);
		fos.close();
		workbook.close();
		System.out.println("Employee File Written Successfully!!");
	}
}
