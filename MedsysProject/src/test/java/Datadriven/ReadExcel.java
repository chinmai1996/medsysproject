package Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
	public void Excelread() throws IOException {
		//open file
	 FileInputStream file=new FileInputStream(System. getProperty("user.dir")+"\\TestDatamedsys\\medsyData.xlsx");
		//open workbook
	XSSFWorkbook workbook=new XSSFWorkbook(file);
		//goto sheet
	XSSFSheet sheet=workbook.getSheet("sheet2");
		//find no of rows with data
	int rows=sheet.getLastRowNum();
		//find no of cells in a row
	int cells=sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(cells);
	  for(int r=0;r<=rows;r++) {
		  XSSFRow currentRow=sheet.getRow(r);
		  for(int c=0;c<cells;c++) {
			String value=currentRow.getCell(c).toString();
			System.out.print(value+"  ");
			  }
			System.out.println();
		    }
			workbook.close();
			file.close();

		}
	
	  }


