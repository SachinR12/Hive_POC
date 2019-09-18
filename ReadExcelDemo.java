package com.hive.proj;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadExcelDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try
        {
			File files = new File("H:\\NPN TRAINING\\HIVE PROJECT\\Data_Sheet.xlsx");
            FileInputStream file = new FileInputStream(files);
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellTypeEnum()) {
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                    case STRING:
                        System.out.print(cell.getRichStringCellValue().getString());
                        break;
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(cell.getDateCellValue());
                        } else {
                            System.out.print(cell.getNumericCellValue());
                        }
                        break;
                    case FORMULA:
                        System.out.print(cell.getCellFormula());
                        break;
                    case BLANK:
                        System.out.print("");
                        break;
                    default:
                        System.out.print("");
                }

                }
                System.out.println("");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

	}

}
