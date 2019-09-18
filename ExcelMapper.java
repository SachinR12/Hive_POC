package com.hive.proj;

import java.io.File;
import java.util.List;

import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
import io.github.millij.poi.ss.reader.XlsReader;
import io.github.millij.poi.ss.reader.XlsxReader;

@Sheet("ExcelMapper")
public class ExcelMapper {
	
	
	
	@SheetColumn("NAME")
	public String name;
	
	@SheetColumn("ID")
    public Integer id;
	
	public ExcelMapper() {
		
	}
	
	public ExcelMapper(String name, Integer id) {
		super();
		this.name=name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	 @Override
    public String toString() {
        return "ExcelMapper [name=" + name + ", id=" + id + "]";
    }
  

}
