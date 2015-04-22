package edu.asu.bmi.cad591.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.asu.bmi.cda.fhir.Patient;

/**
 * FHIRService!
 */
@Path( "FHIRService" )
public interface FHIRService
{
    @Path( "Patient/{pid}" )
    @GET
    @Produces( { MediaType.APPLICATION_XML } )
    Patient getPatient(@PathParam("pid") String pid);
}
