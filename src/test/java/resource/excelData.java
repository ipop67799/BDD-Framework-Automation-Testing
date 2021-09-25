package resource;
import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.util.NumberToTextConverter;
public class excelData {
	// Identify testCase column by scanning the entire 1st row
	// Once column is identified, scan column where testCase is written, to identify purchase testCase
	// Scan (pull all data) from entire row which contain Purchase testCase
	public ArrayList<String> getData(String testCaseName) throws IOException {
		// XSSFWorkbook accepts FileInputStream argument
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(".\\excelData.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		int k = 0, column = 0;
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();									// Access first row
				Iterator<Cell> ce = firstRow.cellIterator();
				ce.next();
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCase")) {column = k;}
					k++;
				}
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellType() == CellType.STRING) {
								a.add(c.getStringCellValue());
							}
							else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return a;
	}
}