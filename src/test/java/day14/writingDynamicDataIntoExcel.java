package day14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class writingDynamicDataIntoExcel {


		public static void main(String[] args) throws IOException {
				
			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\testData3.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("DynamicData1");
			Scanner sn = new Scanner(System.in);
			
			System.out.println("Enter total no of rows:?");
			int Rows = sn.nextInt();
			
			System.out.println("Enter total no of columns:?");
			int Columns = sn.nextInt();
			
			for(int r=0;r<=Rows;r++) {
				
				XSSFRow currentRow = sheet.createRow(r);
				
				for(int c=0;c<Columns;c++) {
					
					XSSFCell cell = currentRow.createCell(c);
					cell.setCellValue(sn.next());
					
				}
			}
			
					
			workbook.write(file);
			workbook.close();
			file.close();
			
			System.out.println("File is created ......");
					
					

			}

	}

