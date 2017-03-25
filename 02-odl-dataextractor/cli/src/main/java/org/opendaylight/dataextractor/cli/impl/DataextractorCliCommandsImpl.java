/*
 * Copyright © 2016 LEBB, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.dataextractor.cli.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.opendaylight.dataextractor.cli.api.DataextractorCliCommands;

public class DataextractorCliCommandsImpl implements DataextractorCliCommands {

    private static final Logger LOG = LoggerFactory.getLogger(DataextractorCliCommandsImpl.class);
    private final DataBroker dataBroker;

    public DataextractorCliCommandsImpl(final DataBroker db) {
        this.dataBroker = db;
        LOG.info("DataextractorCliCommandImpl initialized");
    }

    @Override
    public Object testCommand(Object testArgument) {
        return "This is a test implementation of test-command";
    }
}