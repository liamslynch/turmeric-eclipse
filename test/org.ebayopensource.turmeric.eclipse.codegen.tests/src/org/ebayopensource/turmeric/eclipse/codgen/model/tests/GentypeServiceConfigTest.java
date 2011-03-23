/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.codgen.model.tests;

import static org.junit.Assert.*;

import java.util.Map;

import org.ebayopensource.turmeric.eclipse.codegen.model.GenTypeServiceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GentypeServiceConfigTest {

	GenTypeServiceConfig model = null;
	@Before
	public void setUp() throws Exception {
		model = new GenTypeServiceConfig();
	}

	@After
	public void tearDown() throws Exception {
		model = null;
	}

	@Test
	public void testGetCodeGenOptionsServiceConfigGroupNull() {
		Map<String, String> map = model.getCodeGenOptions();
		assertFalse(map.containsKey(GenTypeServiceConfig.PARAM_SCGN));
	}

	@Test
	public void testGetCodeGenOptionsServiceConfigGroup() {
		model.setServiceConfigGroup("ServiceConfigGroup");
		Map<String, String> map = model.getCodeGenOptions();
		assertTrue(map.containsKey(GenTypeServiceConfig.PARAM_SCGN));
	}
	
	@Test
	public void testGenTypeServiceConfig() {
		assertEquals(GenTypeServiceConfig.GENTYPE_SERVER_CONFIG, model.getGenType());
	}

}
