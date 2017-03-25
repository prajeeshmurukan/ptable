package com.dataextractor.periodictable;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.dataextractor.periodictable.model.PeriodicTable;

public class PeriodicTableExtractorTest {

public static void main(String[] args) {
	  Result result = JUnitCore.runClasses(PeriodicTableExtractorTest.class);
	  System.out.println("UnitTest Cases executed . Total Failed cases - --> " + result.getFailureCount());
}
	@Test
	public void testParseData()throws Exception {
		
		String currDir = System.getProperty("user.dir");
		System.out.println("current Dr = " + currDir);
		String propDir = currDir+"";
		PeriodicTableExtractor extractor =  PeriodicTableExtractor.getInstance();
		PeriodicTable table = null;
		
			table = extractor.parseData(propDir+"/periodic_table_elem.csv");
		
		//1 . check period table is not null 
		
		assertNotNull(table);
		// 2. check table contains a list
		assertNotNull(table.getElements());
		 
	}



	@Test
	public void testSaveAsJson() throws Exception {
		String currDir = System.getProperty("user.dir");
		String propDir = currDir+"";
		PeriodicTableExtractor extractor =  PeriodicTableExtractor.getInstance();
		PeriodicTable table = null;
	
			table = extractor.parseData(propDir+"/periodic_table_elem.csv");
			extractor.saveAsXML(table, propDir+"/PT.xml");
			assertTrue(new File(propDir+"/PT.xml").exists());
		
	}

	@Test
	public void testSaveAsXML()throws Exception {
		String currDir = System.getProperty("user.dir");
		String propDir = currDir+"";
		PeriodicTableExtractor extractor =  PeriodicTableExtractor.getInstance();
		PeriodicTable table = null;
	
			table = extractor.parseData(propDir+"/periodic_table_elem.csv");
			extractor.saveAsXML(table, propDir+"/PT.json");
			assertTrue(new File(propDir+"/PT.json").exists());
		
		
	}

}
