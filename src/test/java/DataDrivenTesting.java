import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub

		//Step 1 :-
		File filePath= new File("C:\\Users\\PriyanshMaheshwari\\Desktop\\LearnToHandle.xlsx");
		
		//Step 2 :-
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
	int sheetNum=	workbook.getNumberOfSheets();
	for(int i =0;i<sheetNum;i++) {
		
		if(workbook.getSheetName(i).equalsIgnoreCase("testData")) {
		//System.out.println(workbook.getSheetAt(i));
	
	XSSFSheet sheet= workbook.getSheetAt(i);
	
	Iterator<Row> row=sheet.iterator(); 
	Row firstRow=row.next();
	
	Iterator<Cell> cell=firstRow.cellIterator();
	//cell.next();
	
	while(cell.hasNext()) {
		Cell cellname=cell.next();
		if(cellname.getStringCellValue().equalsIgnoreCase("name")) {
			System.out.println("desired column to work upon is : "+cellname.getStringCellValue());
		}
		
		
	}
	
		}
	}
		
		
		
	}

}
