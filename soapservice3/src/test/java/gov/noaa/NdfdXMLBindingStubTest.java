package gov.noaa;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;


public class NdfdXMLBindingStubTest {

    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53508");
        //assertEquals("???", result);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(result));

            String list = dwml.getLatLonList();

            assertEquals("42.8617,-89.5365", list);

        } catch (Exception exception) {
            System.out.println("Problems..." + exception);
        }
    }
}

