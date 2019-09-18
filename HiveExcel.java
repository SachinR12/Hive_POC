package com.hive.proj;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Sheet("TableData")
public class HiveExcel {

	
	@SheetColumn("column_name")
	public String columnName;
	
	@SheetColumn("Datatype")
	public String datatype;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	
}
