package edu.asu.bmi.cad591.api.impl;


import org.springframework.stereotype.Service;

import edu.asu.bmi.cad591.api.FHIRService;
import edu.asu.bmi.cda.fhir.Patient;

/**
 * @author TS
 */
@Service( "fhirService#default" )
public class DefaultFHIRService
    implements FHIRService
{
	public Patient getPatient(String pid)
    {
        Patient pat = new Patient();
        
        pat.setId(pid);
        pat.getId();
        
        return pat;
        
       /*
        Patient pat = new Patient();
        Identifier ID = new Identifier();
        ID.setValue(pid);
        pat.getIdentifiers().add(ID);
        */        
    }

}
