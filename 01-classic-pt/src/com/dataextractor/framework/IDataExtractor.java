package com.dataextractor.framework;

import com.dataextractor.periodictable.model.PeriodicTable;

public interface IDataExtractor {
	public Object parseData(String filePath) throws Exception;
	public void logResults(PeriodicTable table) throws Exception;
	public void saveAsJson(PeriodicTable table , String filePath) throws Exception;
	public void saveAsXML(PeriodicTable table , String filePath) throws Exception;
}
