package MainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelutility {

	public static void main(String[] args) throws IOException {
		
		
		
		File src =new File("C:\\Users\\SWAYAM\\Desktop\\AA_Biswa\\New folder\\TestData.xlsx");
		
		//load file
		FileInputStream fis = new FileInputStream(src); 
		
		//Load workbook
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		//load sheet
		HSSFSheet sh1 = wb.getSheetAt(0);
		
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		
		
		
		

	}

}
