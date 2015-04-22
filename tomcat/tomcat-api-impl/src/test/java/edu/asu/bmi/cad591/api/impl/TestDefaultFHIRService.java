package edu.asu.bmi.cad591.api.impl;

import edu.asu.bmi.cad591.api.FHIRService;
import edu.asu.bmi.cda.fhir.Patient;
import junit.framework.TestCase;

import org.apache.catalina.Context;
import org.apache.catalina.deploy.ApplicationParameter;
import org.apache.catalina.startup.Tomcat;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.web.context.ContextLoaderListener;

/**
 * @author TS
 */
@RunWith( JUnit4.class )
public class TestDefaultFHIRService
    extends TestCase
{
    int port;

    private Tomcat tomcat;

    @Before
    public void startTomcat()
        throws Exception
    {
        tomcat = new Tomcat();
        tomcat.setBaseDir( System.getProperty( "java.io.tmpdir" ) );
        tomcat.setPort( 0 );

        Context context = tomcat.addContext( "", System.getProperty( "java.io.tmpdir" ) );

        ApplicationParameter applicationParameter = new ApplicationParameter();
        applicationParameter.setName( "contextConfigLocation" );
        applicationParameter.setValue( getSpringConfigLocation() );
        context.addApplicationParameter( applicationParameter );

        context.addApplicationListener( ContextLoaderListener.class.getName() );

        Tomcat.addServlet( context, "cxf", new CXFServlet() );
        context.addServletMapping( "/" + getRestServicesPath() + "/*", "cxf" );

        tomcat.start();

        port = tomcat.getConnector().getLocalPort();

        System.out.println("Tomcat started on port:"+port);
    }

    @After
    public void stopTomcat()
        throws Exception
    {
        tomcat.stop();
    }

    protected String getRestServicesPath()
    {
        return "foo";
    }

    protected String getSpringConfigLocation()
    {
        return "classpath*:META-INF/spring-context.xml";
    }

    String endpoint = "http://localhost:8080";
    String path = "/hello";
    String rest = "/restServices";
    String server = "/testServices/";
    
    @Test
    public void testFHIR()
    {
        FHIRService service =
            JAXRSClientFactory.create( 
            		endpoint + path + rest + server, FHIRService.class );
        String pid = "foo";
        //Patient p = new Patient();
       // p.setId(pid);
        //p.getId();
        Patient pat = service.getPatient( pid );
        assertEquals( pat, service.getPatient( pid ) );
        
        /*
         FHIRService service =
            JAXRSClientFactory.create( 
            		endpoint + path + rest + server, FHIRService.class );
        edu.asu.bmi.cda.fhir.String pid = new edu.asu.bmi.cda.fhir.String();
        pid.setValue("foo");
        Patient p = service.getPatient( pid );
        assertEquals( pid, service.getPatient( pid ) );
         */
        
        
    }
}
