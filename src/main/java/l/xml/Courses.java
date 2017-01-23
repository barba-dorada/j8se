package l.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tischenko on 23.01.2017.
 */
@XmlRootElement
public class Courses {
    @XmlElement(name="course")
    public Course[] carray;
}
