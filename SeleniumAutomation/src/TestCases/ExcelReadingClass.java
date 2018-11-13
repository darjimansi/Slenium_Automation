package TestCases;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadingClass {
	
	public static void main(String[] args) throws Throwable {
		
		Xls_Reader xls = new Xls_Reader ("C:\\Users\\HomePC\\Documents\\Zoom\\files\\Config_data.xlsx") ;
		String a = xls.getCellData("Test Steps", "ObjectValue", 5);
		System.out.println(xls.getRowCount("Test Steps"));
		xls.setCellData("Test Steps", "Result", 2, "Pass");
		System.out.println(a);
		
		
//		InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\HomePC\\Documents\\Zoom\\files\\Config_data.xlsx");
//		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
//		
//		XSSFSheet sheet = wb.getSheetAt(1);
//		XSSFRow row; 
//		XSSFCell cell;
//
//		Iterator<Row> rows = sheet.rowIterator();
//
//		while (rows.hasNext())
//		{
//			row=(XSSFRow) rows.next();
//			Iterator<Cell> cells = row.cellIterator();
//			while (cells.hasNext())
//			{
//				cell=(XSSFCell) cells.next();
//		
//				if (cell.getCellType() == CellType.STRING)
//				{
//					System.out.print(cell.getStringCellValue()+" ");
//				}
//				else if(cell.getCellType() == CellType.NUMERIC)
//				{
//					System.out.print(cell.getNumericCellValue()+" ");
//				}
//				else
//				{
//					//U Can Handel Boolean, Formula, Errors
//				}
//			}
//			System.out.println();
//		}
	}

}
