package com.emsi.Jersy_Spring;

import com.emsi.Jersy_Spring.entities.Compte;
import com.emsi.Jersy_Spring.entities.TypeCompte;
import org.junit.jupiter.api.Test;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.util.Date;

public class CompteSerializationTest {

    @Test
    public void testXmlSerialization() throws Exception {
        Compte compte = new Compte(1L, 1000.0, new Date(), TypeCompte.COURANT);
        JAXBContext jaxbContext = JAXBContext.newInstance(Compte.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(compte, System.out);
    }
}

