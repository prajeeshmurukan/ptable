package com.dataextractor.entrypoint.main;

import com.dataextractor.periodictable.PeriodicTableExtractor;
import com.dataextractor.periodictable.model.PeriodicTable;

public class PeriodicTableExtractorEntryPoint {

	public PeriodicTableExtractorEntryPoint() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		try{
			PeriodicTableExtractor extractor =  PeriodicTableExtractor.getInstance();
			PeriodicTable table = extractor.parseData("D:\\periodic_table_elem.csv");
			extractor.logResults(table);
			extractor.saveAsJson(table, "D:\\PT.json");
			extractor.saveAsXML(table, "D:\\PT.xml");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
