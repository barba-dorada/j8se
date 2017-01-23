package l.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.math.BigDecimal;

public class MainIn {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc=JAXBContext.newInstance(Courses.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File inFile = new File("./build/resources/main/l/xml/test.xml");
        Courses res = (Courses) unmarshaller.unmarshal(inFile);

    }

}

