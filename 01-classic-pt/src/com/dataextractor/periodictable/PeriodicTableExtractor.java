/**
 * 
 */
package com.dataextractor.periodictable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.dataextractor.framework.IDataExtractor;
import com.dataextractor.periodictable.model.Element;
import com.dataextractor.periodictable.model.PeriodicTable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * @author pmurukan
 *
 */
public class PeriodicTableExtractor implements IDataExtractor {

	/**
	 * 
	 */
	static PeriodicTableExtractor obj = new PeriodicTableExtractor();
	
	public static PeriodicTableExtractor getInstance(){
		return obj;
	}
	private PeriodicTableExtractor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public PeriodicTable parseData(String filePath) throws Exception {

		
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<Element> list = new ArrayList<Element>();
        try {

            br = new BufferedReader(new FileReader(filePath));
            
            while ((line = br.readLine()) != null) {
            	Element element = new Element();
                // use comma as separator
                String[] elementArr = line.split(cvsSplitBy);
                //System.out.println("PeriodicTableExtractor.parseData()" + elementArr);
                 /*"atomicNumber",
                " element",
                " symbol",
                " atomicweight",
                " period",
                " group",
                " phase",
                " mostStableCrystal",
                " type",
                " ionicRadius",
                " atomicRadius",
                " electronegativity",
                " firstIonizationPotential",
                " density",
                " meltingPointK",
                " boilingPointk",
                " isotopes",
                " discoverer",
                " yearofDiscovery",
                " specificHeatCapacity",
                " electronConfiguration",
                " displayRow",
                " displayColumn"
                */
                element.setAtomicNumber(elementArr[0]);
                element.setElement(elementArr[1]);
                element.setSymbol(elementArr[2]);
                element.setAtomicweight(elementArr[3]);
                element.setPeriod(elementArr[4]);
                element.setGroup(elementArr[5]);
                element.setPhase(elementArr[6]);
                element.setMostStableCrystal(elementArr[7]);
                element.setType(elementArr[8]);
                element.setIonicRadius(elementArr[9]);
                element.setAtomicRadius(elementArr[10]);
                element.setElectronegativity(elementArr[11]);
                element.setFirstIonizationPotential(elementArr[12]);
                element.setDensity(elementArr[13]);
                element.setMeltingPointK(elementArr[14]);
                element.setBoilingPointk(elementArr[15]);
                element.setIsotopes(elementArr[16]);
                element.setDiscoverer(elementArr[17]);
                element.setYearofDiscovery(elementArr[18]);
                element.setSpecificHeatCapacity(elementArr[19]);
                element.setElectronConfiguration(elementArr[20]);
                element.setDisplayRow(elementArr[21]);
                element.setDisplayColumn(elementArr[22]);
                list.add(element);
                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        PeriodicTable table = new PeriodicTable();
        table.setElements(list);
        table.setGeneratedAt(new Date());
        return table;
        
	
		
	}
	
	

	@Override
	public void logResults(PeriodicTable table) {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLogger("Periodic Table Logger ========> ");
		logger.info("Periodic Table Generated at " + table.getGeneratedAt());
		ArrayList<Element> elements = table.getElements();
	    elements.forEach((element) -> {
	    	logger.info(element.toString());
		});
		
	}

	@Override
	public void saveAsJson(PeriodicTable table, String filePath) {
		// TODO Auto-generated method stub

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try (FileWriter writer = new FileWriter(filePath)) {

            gson.toJson(table, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
	}

	@Override
	public void saveAsXML(PeriodicTable table, String filePath) throws Exception{
		// TODO Auto-generated method stub
		File file = new File(filePath);
		JAXBContext jaxbContext = JAXBContext.newInstance(PeriodicTable.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(table, file);
		jaxbMarshaller.marshal(table, System.out);
	}

}
