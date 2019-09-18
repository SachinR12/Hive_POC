package com.hive.proj;

import java.io.File;
import java.util.List;

import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsxReader;

public class HiveReader {

	public static void main(String[] args) throws SpreadsheetReadException {
		// TODO Auto-generated method stub
		 File xlsxFile = new File("H:\\NPN TRAINING\\HIVE PROJECT\\Data_Sheet.xlsx");
		    XlsxReader reader = new XlsxReader();
		    List<HiveExcel> columns = reader.read(HiveExcel.class, xlsxFile,0);
		    
		    StringBuilder table = new StringBuilder();
		    StringBuilder tablestat;
		    
		    String table1 = "";
		    
		    
		    for(HiveExcel column : columns) {
	          tablestat=(new StringBuilder()).append(column.getColumnName().toString()).append(" ").append(column.getDatatype().toString()).append(",");
	          table.append(tablestat.toString());
	          table1= table.substring(0, table.length() - 1);
	        }
		  
		    String table3 = "create table hivetable (" + table1.toString() +")";
		    
		   
		    
		    System.out.println(table3);
	}

}
