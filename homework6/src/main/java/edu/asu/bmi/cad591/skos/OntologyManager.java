package edu.asu.bmi.cad591.skos;

import java.io.FileOutputStream;
import java.util.Set;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class OntologyManager {

	OWLOntologyManager manager;
	OWLDataFactory factory;
	OWLOntology ontology;
		
	// ---------------------------------------------------------------------------------
	//	Task II – OWL API basics: 
	//	OWLOntologyManger – which is responsible for loading, updating and saving an OWLOntology 
	//	OWLDataFactory – which allows to create new assertions to add to the OWLOntology.
	// ---------------------------------------------------------------------------------		
	public OWLOntology getPopulatedOntology(String owlFileName) throws Exception {	
		manager = OWLManager.createOWLOntologyManager();
		factory = manager.getOWLDataFactory();
		ontology = manager.loadOntologyFromOntologyDocument(this.getClass().getResourceAsStream(owlFileName));

		return(ontology);
	}

	// ---------------------------------------------------------------------------------
	//	Task III – Modeling a taxonomy 
	//	Helper methods: addCodedConcept(), addRelationship(), getPopulatedOntology 
	//	SNOWMED Root Concept: Observable entity
	//	https://github.com/BMI-591-CAD-2015/AntonellaDipace/tree/master/homework6
	// ---------------------------------------------------------------------------------
	public void addCodedConcept(String id, String dproperty, String code)
		throws OWLOntologyStorageException, OWLOntologyCreationException{
		manager.addAxiom(ontology, factory.getOWLDeclarationAxiom(factory.getOWLNamedIndividual(IRI.create(id))));
		manager.addAxiom(ontology, factory.getOWLDataPropertyAssertionAxiom(factory.getOWLDataProperty(IRI.create(dproperty)), factory.getOWLNamedIndividual(IRI.create(id)), code));
	}
	public void addRelationship(String subject, String property, String object) {
		manager.addAxiom(ontology, factory.getOWLObjectPropertyAssertionAxiom(factory.getOWLObjectProperty(IRI.create(property)), factory.getOWLNamedIndividual(IRI.create(subject)), factory.getOWLNamedIndividual(IRI.create(object))));
	}
	public void printOntology(String outOwlFileName) throws Exception {	
		manager.saveOntology(ontology,System.out);
		manager.saveOntology(ontology, new FileOutputStream(outOwlFileName));
	}
	 public boolean checkRelationship( String subject, String predicate, String object ) {
	        OWLNamedIndividual sub = factory.getOWLNamedIndividual( IRI.create( subject ) );
	        OWLNamedIndividual obj = factory.getOWLNamedIndividual( IRI.create( object ) );
	        OWLObjectProperty prp = factory.getOWLObjectProperty( IRI.create( predicate ) );

	        Set<OWLObjectPropertyAssertionAxiom> info = ontology.getObjectPropertyAssertionAxioms( sub );
	        OWLObjectPropertyAssertionAxiom testX = factory.getOWLObjectPropertyAssertionAxiom( prp, sub, obj );

	        return( info.contains( testX ) );
	}

}
