package fhir;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

import edu.asu.bmi.cda.fhir.Patient;

public class patientMarshallTest {

	@SuppressWarnings("restriction")
	@Test
	public void testMarshaller() throws Exception {

		JAXBContext c = JAXBContext.newInstance(Patient.class.getPackage().getName());
		Unmarshaller um = c.createUnmarshaller();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("data/patient_example.xml");

		Patient patientInput = (Patient) um.unmarshal(is);

		OutputStream os = new FileOutputStream(new File("patient_example_output.xml"));
		
		Marshaller m = c.createMarshaller();
		//m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		m.marshal(patientInput, os);
		m.marshal(patientInput, System.out);

		is.close();
		os.close();


	}
}
