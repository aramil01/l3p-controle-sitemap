package fr.ramil.l3pcontrolesitemap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class sitemapservice {

    public Urlset javatoxml(String XML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance();

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Urlset = (Urlset) unmarshaller.unmarshal(Urlset);



    }




    public String xmltojava(Urlset u) throws JAXBException{

        JAXBContext jaxbContext = JAXBContext.newInstance(Urlset.class);

        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        marshaller.marshal(u, new File("sitemapservice.xml"));

    }
}



