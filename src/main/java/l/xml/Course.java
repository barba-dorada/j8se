package l.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 * Created by tischenko on 23.01.2017.
 */
public class Course {
    @XmlAttribute
    String id;
    @XmlElement
    String name;
    @XmlAttribute
    BigDecimal price;
}
