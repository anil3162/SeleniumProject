package day14;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//excel file --> workbook --> sheet --> row --> cell

public class readingDataFromXL {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\testData1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalCells);
		
		for(int r=0;r<=totalRows;r++) 
		{
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) 
			{
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString() + "\t");
				
			}
			System.out.println();
			
		}
		
		
	}

}
