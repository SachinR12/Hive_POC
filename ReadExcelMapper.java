package com.hive.proj;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsxReader;

public class ReadExcelMapper {

	public static void main(String[] args) throws SpreadsheetReadException {
		  File xlsxFile = new File("H:\\NPN TRAINING\\HIVE PROJECT\\Data_Sheet.xlsx");
		    XlsxReader reader = new XlsxReader();
		    List<ExcelMapper> employees = reader.read(ExcelMapper.class, xlsxFile,0);
		    
		   // employees.forEach(System.out::println);
		   
		   // employees.get(1);
		    
		    for(ExcelMapper employee : employees) {
	            System.out.println(employee.getId());
	            System.out.println(employee.getName());
	        }
		    
		    // System.out.println(employees.get(0).name);
		    // System.out.println(employees.get(1).name);
		    // System.out.println(employees.get(2).name);
		   // System.out.println(employees.get(3).name);
		    
		   // System.out.println(employees.toString());
		    
		    ExcelMapper mapper = new ExcelMapper();
		  // System.out.println(mapper.getName());
		   
		   // System.out.println(Arrays.toString(employees.toArray()));
		   
		    System.out.println(employees.size());
	}

}
