package l.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainIn {
    public static void main(String[] args) throws JAXBException {
        File file = new File( "build/resources/main/l/xml/test.xml" );
        JAXBContext jaxbContext = JAXBContext.newInstance( Training.class );
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Training training = (Training)jaxbUnmarshaller.unmarshal( file );
        System.out.println( training );
    }

}

