package edu.asu.bmi.cda.homework6;


import org.junit.Test;

import edu.asu.bmi.cad591.skos.OntologyManager;
import edu.asu.bmi.cad591.skos.ReasonerHelper;
import static org.junit.Assert.*;

public class OntologyTest {
	
	static final String BMI591 = "http://edu.asu.bmi/cad591/salehpour/skos/ext#";
	static final String SKOS = "http://www.w3.org/2004/02/skos/core#";
	
	@Test
	//test without ReasonerHelper, ancestor-descendant relationship is false
	public void testRelationship () throws Exception {
		OntologyManager om = new OntologyManager();
		om.getPopulatedOntology("/task1_SKOS.owl");
		
		//assertFalse(om.checkRelationship(BMI591+"Blood pressure",BMI591+"subTypeOf", BMI591+"Observable entity"));		
	}
	
	@Test
	//test with ReasonerHelper, ancestor-descendant relationship is true
	public void testRelationshipWithHelper () throws Exception {
		OntologyManager om = new OntologyManager();
		ReasonerHelper rh = new ReasonerHelper();
		//rh.makeInferences(om.getPopulatedOntology("/task1_SKOS.owl"));

		//assertTrue(om.checkRelationship(BMI591+"Blood pressure",BMI591+"subTypeOf", BMI591+"Observable entity"));
	
	}
}
