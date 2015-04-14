package fhir;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import edu.asu.bmi.cda.fhir.Patient;

public class patientUnmarshallTest {

	@Test
	public void testUnmarshaller() throws Exception {

		JAXBContext c = JAXBContext.newInstance(Patient.class.getPackage().getName());
		Unmarshaller um = c.createUnmarshaller();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("data/patient_example.xml");

		Patient p = (Patient) um.unmarshal(is);
		
		assertEquals(p.getNames().get(0).getGivens().get(0).getValue(),"Roelof Olaf");
		assertEquals(p.getNames().get(0).getFamilies().get(0).getValue(),"Bor");
		assertEquals(p.getIdentifiers().get(0).getValue().getValue(),"123456789");
        assertEquals(p.getGender().getCodings().get(0).getDisplay().getValue(),"Male");
		assertEquals(p.getGender().getCodings().get(0).getCode().getValue(),"248153007");	
		assertEquals(p.getMaritalStatus().getCodings().get(0).getDisplay().getValue(),"Legally married");
        assertEquals(p.getMaritalStatus().getCodings().get(0).getCode().getValue(),"36629006");
		
        System.out.println("Patient Name: " + p.getNames().get(0).getGivens().get(0).getValue() +" "+ 
				p.getNames().get(0).getFamilies().get(0).getValue());
        System.out.println("Patient ID: " + p.getIdentifiers().get(0).getValue().getValue());
        System.out.println("Gender: " + p.getGender().getCodings().get(0).getDisplay().getValue() +
				" ("+ p.getGender().getCodings().get(0).getCode().getValue() +")");
        System.out.println("Marital Status: " + p.getMaritalStatus().getCodings().get(0).getDisplay().getValue() +
				" ("+ p.getMaritalStatus().getCodings().get(0).getCode().getValue()+ ")");
		
		is.close();

	}
}
