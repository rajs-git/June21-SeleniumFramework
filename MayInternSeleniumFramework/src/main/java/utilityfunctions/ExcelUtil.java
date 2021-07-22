package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	static XSSFSheet sheet = null;

	public static void getSheet() {
		XSSFWorkbook workbook=null;
		try {
			workbook=new XSSFWorkbook("C:\\Users\\rsing\\Documents\\Study\\Current\\Yes-M Systems\\MayInternSeleniumFramework\\TestData\\Data.xlsx");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		sheet=workbook.getSheet("Sheet1");
	}

	public static int getRowCount()	{
		ExcelUtil.getSheet();
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);	
		return rowcount;
	}

	public static int getColumnCount()	{
		ExcelUtil.getSheet();
		int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colcount);	
		return colcount;
	}

	public static String getStringCellValue(int rowno, int colno)	{
		ExcelUtil.getSheet();
		String data = sheet.getRow(rowno).getCell(colno).getStringCellValue();
		System.out.println(data);	
		return data;

	}

}
