/*
 * Copyright © 2016 LEBB, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.dataextractor.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dataextractor.periodictable.PeriodicTableExtractor;
import com.dataextractor.periodictable.model.PeriodicTable;

public class DataextractorProvider {

    private static final Logger LOG = LoggerFactory.getLogger(DataextractorProvider.class);

    private final DataBroker dataBroker;

    public DataextractorProvider(final DataBroker dataBroker) {
        this.dataBroker = dataBroker;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
	System.out.println("kallan666666666.........................................................");
		try{
		System.out.println("Working Directory = " +System.getProperty("user.dir"));
			String currDir = System.getProperty("user.dir");
			String propDir = currDir+"/../../../";
			PeriodicTableExtractor extractor =  PeriodicTableExtractor.getInstance();
			PeriodicTable table = extractor.parseData(propDir+"/periodic_table_elem.csv");
			extractor.logResults(table);
			extractor.saveAsJson(table, propDir+"/PT.json");
			extractor.saveAsXML(table, propDir+"/PT.xml");

		}catch(Exception e){
			e.printStackTrace();
		}

        LOG.info("DataextractorProvider Session Initiated");
	LOG.info("Kallan using initi log");
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("DataextractorProvider Closed");
    }
}
