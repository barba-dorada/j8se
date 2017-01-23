package l.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.math.BigDecimal;

public class MainOut {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jc=JAXBContext.newInstance(Courses.class);
        Marshaller m = jc.createMarshaller();
        Courses courses=new Courses();
        Course c1=new Course();
        c1.id="c1";
        c1.name="курс 1";
        c1.price= BigDecimal.ONE;
        Course c2=new Course();
        c2.id="c2";
        c2.name="курс 2";
        c2.price= BigDecimal.TEN;
        courses.carray=new Course[2];
        courses.carray[0]=c1;
        courses.carray[1]=c2;
        m.marshal(courses,System.out);
    }

}

