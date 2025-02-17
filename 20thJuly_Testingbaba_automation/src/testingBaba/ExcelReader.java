package testingBaba;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String readExcel(int row, int col, int shtNo)
	{
		String path = "C:\\Users\\Dell\\eclipse-workspace\\20thJuly_Testingbaba_automation\\testData\\Untitled spreadsheet (6).xlsx";
	    String val = "";
		try
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(shtNo);
	    val = sheet.getRow(row).getCell(col).getStringCellValue();
	}
	catch (Exception e)
	{
		System.out.println("Issue in get read data : " + e);
	}
	return val;
	}
	public static void main(String[] args) {
		ExcelReader ob = new ExcelReader();
		int j=1;
		for(int i=1; i<=4; i++)
		{
	 String nameField= ob.readExcel(i, 0, 0);
	 String emailfield = ob.readExcel(i, 1, 0);
	 System.out.println(nameField + " " + emailfield);
		}
	 
	 
		
	}
	
}
