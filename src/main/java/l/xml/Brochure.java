package l.xml;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tischenko on 23.01.2017.
 */
@XmlJavaTypeAdapter(BrochureAdapter.class)
public class Brochure {
    Map<String,Course> courses;
    public Brochure() {
        courses = new HashMap<String, Course>();
    }
}
