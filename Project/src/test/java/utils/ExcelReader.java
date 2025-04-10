package utils;
 
import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/*
    * a. Method Name: readdata()
    * b. Author Name: MD Saif Masoom
    * c. Description: This method is used to read data from an Excel sheet
    * d. Parameters: int rownumber, int colnumber
    * e. Return type: String
*/
 
public class ExcelReader {
 
    public static FileInputStream file;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
 
    public static String readdata(int rownumber, int colnumber) throws IOException {
        String filepath = System.getProperty("user.dir") + Base.prop.getProperty("excelpath");
        String sheetname= Base.prop.getProperty("sheet");
 
        String cellValue;
        try {
            file = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetname);
            row = sheet.getRow(rownumber);
            cell = row.getCell(colnumber);
            cellValue = cell.toString();
            return cellValue;
        } catch (Exception e) {
            cellValue = "";
        } finally {
            if (workbook != null) {
                workbook.close();
            }
            if (file != null) {
                file.close();
            }
        }
        return cellValue;
    }
}