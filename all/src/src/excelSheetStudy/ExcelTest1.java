package excelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//file path is given and stored file in ref variable 
		FileInputStream MyFile= new FileInputStream("D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\excelTest.xlsx");
		
		
//		String value = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
//	
//		System.out.println("Data form excel is "+value);
//		
//		
//		double value1 = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(0).getCell(2).getNumericCellValue();
//	
//		System.out.println("Data form excel is "+value1);
//		
		
		
		Workbook test = WorkbookFactory.create(MyFile);
		Sheet Mysheet = test.getSheet("Sheet2");
		Row MyRow = Mysheet.getRow(0);
		Cell MyCell = MyRow.getCell(0);
		String MyValue = MyCell.getStringCellValue();
		
		System.out.println(Mysheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(Mysheet.getRow(0).getCell(1).getStringCellValue());
		
	}

}
