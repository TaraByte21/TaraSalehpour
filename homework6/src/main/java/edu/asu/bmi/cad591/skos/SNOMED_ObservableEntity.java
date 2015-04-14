package edu.asu.bmi.cad591.skos;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;


public class SNOMED_ObservableEntity {
		
		static final String BMI591 = "http://edu.asu.bmi/cad591/salehpour/skos/ext#";
		static final String SKOS = "http://www.w3.org/2004/02/skos/core#";

		static OWLOntologyManager manager;
		static OWLDataFactory factory;
		static OWLOntology ontology;
		static String name = "bmiVocabulary";
		static String prefix = "skos:";
		
		public static void main(String[] args) throws Exception {
			
			OntologyManager om = new OntologyManager();			
			om.getPopulatedOntology("/task1_SKOS.owl");
			
			// ---------------------------------------------------------------------------------
			//	SNOWMED Root Concept: Observable entity
			//	http://browser.ihtsdotools.org
			//	https://github.com/BMI-591-CAD-2015/AntonellaDipace/tree/master/homework6
			// ---------------------------------------------------------------------------------
			om.addCodedConcept(BMI591+"Observable_entity_(observable_entity)", SKOS+"notation", "363787002");
			om.addCodedConcept(BMI591+"Vital_sign_(observable_entity)", SKOS+"notation", "46680005");
			om.addCodedConcept(BMI591+"Blood_pressure_(observable_entity)", SKOS+"notation", "75367002");
			om.addCodedConcept(BMI591+"Sitting_blood_pressure_(observable_entity)", SKOS+"notation", "163035008");
			om.addCodedConcept(BMI591+"Sitting_diastolic_blood_pressure_(observable_entity)", SKOS+"notation", "407555005");
			om.addCodedConcept(BMI591+"Sitting_systolic_blood_pressure_(observable_entity)", SKOS+"notation", "407554009");
			om.addCodedConcept(BMI591+"Pulse_rate_(observable_entity)", SKOS+"notation", "78564009");
			om.addCodedConcept(BMI591+"Heart_rate_(observable_entity)", SKOS+"notation", "364075005");

			om.addRelationship(BMI591+"Observable_entity_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Vital_sign_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Blood_pressure_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Sitting_blood_pressure_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Sitting_diastolic_blood_pressure_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Sitting_systolic_blood_pressure_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Pulse_rate_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");
			om.addRelationship(BMI591+"Heart_rate_(observable_entity)", SKOS+"inScheme", BMI591+"bmiVocabulary");

			om.addRelationship(BMI591+"Vital_sign_(observable_entity)", BMI591+"subTypeOf", BMI591+"Observable_entity_(observable_entity)");
			om.addRelationship(BMI591+"Blood_pressure_(observable_entity)", BMI591+"subTypeOf", BMI591+"Vital_sign_(observable_entity)");
			om.addRelationship(BMI591+"Sitting_blood_pressure_(observable_entity)", BMI591+"subTypeOf", BMI591+"Blood_pressure_(observable_entity)");
			om.addRelationship(BMI591+"Sitting_diastolic_blood_pressure_(observable_entity)", BMI591+"subTypeOf", BMI591+"Sitting_blood_pressure_(observable_entity)");
			om.addRelationship(BMI591+"Sitting_systolic_blood_pressure_(observable_entity)", BMI591+"subTypeOf", BMI591+"Sitting_blood_pressure_(observable_entity)");
			om.addRelationship(BMI591+"Pulse_rate_(observable_entity)", BMI591+"subTypeOf", BMI591+"Vital_sign_(observable_entity)");
			om.addRelationship(BMI591+"Heart_rate_(observable_entity)", BMI591+"subTypeOf", BMI591+"Pulse_rate_(observable_entity)");
		
			om.addRelationship(BMI591+"Sitting_diastolic_blood_pressure_(observable_entity)", BMI591+"partOf", BMI591+"Sitting_blood_pressure_(observable_entity)");
			om.addRelationship(BMI591+"Heart_rate_(observable_entity)", BMI591+"partOf", BMI591+"Pulse_rate_(observable_entity)");

			om.printOntology("src/test/resources/task1_SKOSOut.owl");

			// ---------------------------------------------------------------------------------
			//	Adapted from: https://github.com/BMI-591-CAD-2015
			// ---------------------------------------------------------------------------------
		    ReasonerHelper helper = new ReasonerHelper();

		    OWLAxiom axiomTester;
		    helper.makeInferences(ontology);
		    
		    
			//instantiate or looks up an individual with given IRI
			OWLNamedIndividual ind = factory.getOWLNamedIndividual(
					IRI.create(BMI591 + name)
					);
			//instantiate relationship between two individuals
			//adding Observable entity  isA subTypeOf broaderTransitive
			OWLObjectPropertyAssertionAxiom opa = factory.getOWLObjectPropertyAssertionAxiom(
					factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
					factory.getOWLNamedIndividual( IRI.create(prefix+"broaderTransitive")), //subject
					factory.getOWLNamedIndividual(IRI.create(prefix+"Observable entity")) //object
					);
		    //adding Vital sign  isA subTypeOf Observable entity 
		    OWLObjectPropertyAssertionAxiom opa1 = factory.getOWLObjectPropertyAssertionAxiom(
		            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
		            factory.getOWLNamedIndividual( IRI.create(prefix+"Observable entity")), //subject
		            factory.getOWLNamedIndividual(IRI.create(prefix+"Vital sign")) //object
		    );
		    //adding Blood pressure isA subTypeOf Vital sign 
		    OWLObjectPropertyAssertionAxiom opa2 = factory.getOWLObjectPropertyAssertionAxiom(
		            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
		            factory.getOWLNamedIndividual( IRI.create(prefix+"Vital sign")), //subject
		            factory.getOWLNamedIndividual(IRI.create(prefix+"Blood pressure")) //object
		    );
		    //adding Sitting blood pressure isA subTypeOf Blood pressure 
		    OWLObjectPropertyAssertionAxiom opa3 = factory.getOWLObjectPropertyAssertionAxiom(
		            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
		            factory.getOWLNamedIndividual( IRI.create(prefix+"Blood pressure")), //subject
		            factory.getOWLNamedIndividual(IRI.create(prefix+"Sitting blood pressure")) //object
		    );
		    //adding Sitting diastolic blood pressure isA subTypeOf Sitting blood pressure 
		    OWLObjectPropertyAssertionAxiom opa4 = factory.getOWLObjectPropertyAssertionAxiom(
		            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
		            factory.getOWLNamedIndividual( IRI.create(prefix+"Sitting blood pressure")), //subject
		            factory.getOWLNamedIndividual(IRI.create(prefix+"Sitting diastolic blood pressure")) //object
		    );
		    //adding Pulse rate isA subTypeOf Vital sign 
		    OWLObjectPropertyAssertionAxiom opa5 = factory.getOWLObjectPropertyAssertionAxiom(
		            factory.getOWLObjectProperty( IRI.create(prefix+"subTypeOf")), //property
		            factory.getOWLNamedIndividual( IRI.create(prefix+"Vital sign")), //subject
		            factory.getOWLNamedIndividual(IRI.create(prefix+"Pulse rate")) //object
		    );
		    //instantiate data property (attribute) of an individual
		    OWLLiteral value = factory.getOWLLiteral("Vital sign +by relative");
		    OWLDataPropertyAssertionAxiom oda = factory.getOWLDataPropertyAssertionAxiom(
		            factory.getOWLDataProperty(IRI.create(prefix+"subTypeOf")),
		            factory.getOWLNamedIndividual(IRI.create("Vital sign")),
		            value);
		   
		    	
			//The individuals, as well as the object/data property assertions, 
			//do not get added directly to the ontology. We need to add them explicitly:
		    manager.addAxiom(ontology, factory.getOWLDeclarationAxiom(ind));
		    manager.addAxiom(ontology,opa);
		    manager.addAxiom(ontology,opa1);
		    manager.addAxiom(ontology,opa2);
		    manager.addAxiom(ontology,opa3);
		    manager.addAxiom(ontology,opa4);
		    manager.addAxiom(ontology,opa5);
		    manager.addAxiom(ontology, oda);
		
		}

	}
