package l.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by tischenko on 23.01.2017.
 */
@XmlRootElement(name="training")
public class Training {
    @XmlElement
    public Brochure brochure;
    public Training(){}
    public Training( Brochure b ){
        brochure = b;
    }
}
