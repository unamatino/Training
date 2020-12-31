package library;

public interface Constants {
	String sheetName="Geology";
	String excelPath="./excel/NameData.xlsx";
	String appURL=Excel.readExcelData(excelPath, sheetName, 0, 0);
	String instagram=Excel.readExcelData(excelPath, sheetName, 0, 1);
	String twitter=Excel.readExcelData(excelPath, sheetName, 1, 1);
	String instagramExpTitle=Excel.readExcelData(excelPath, sheetName, 0, 2);
	String twitterExpTitle=Excel.readExcelData(excelPath, sheetName, 1, 2);
}
