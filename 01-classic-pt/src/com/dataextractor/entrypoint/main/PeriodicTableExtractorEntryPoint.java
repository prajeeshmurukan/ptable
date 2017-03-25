package com.dataextractor.entrypoint.main;

import com.dataextractor.periodictable.PeriodicTableExtractor;
import com.dataextractor.periodictable.model.PeriodicTable;

public class PeriodicTableExtractorEntryPoint {

	public PeriodicTableExtractorEntryPoint() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		try{
			String currDir = System.getProperty("user.dir");
			System.out.println("Current DIR = >" + currDir);
			String propDir = currDir+"";
			PeriodicTableExtractor extractor =  PeriodicTableExtractor.getInstance();
			PeriodicTable table = extractor.parseData(propDir+"/periodic_table_elem.csv");
			extractor.logResults(table);
			extractor.saveAsJson(table, propDir+"/PT.json");
			extractor.saveAsXML(table, propDir+"/PT.xml");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
