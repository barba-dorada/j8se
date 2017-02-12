package ru.cwl;

import ru.cwl.ws.cbr.dailyinfo.DailyInfo;
import ru.cwl.ws.cbr.dailyinfo.DailyInfoSoap;
import ru.cwl.ws.cbr.dailyinfo.GetCursOnDateResponse;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Created by adm on 11.02.2017.
 */
public class CBRServise {
    public static void main(String[] args) throws DatatypeConfigurationException {
        DailyInfo di = new DailyInfo();
        DailyInfoSoap port = di.getDailyInfoSoap();

     // http://anteastra.blogspot.ru/2012/12/java-web-sercice.html

        DatatypeFactory f = DatatypeFactory.newInstance();
        XMLGregorianCalendar dd = f.newXMLGregorianCalendar();
        dd.setDay(10);
        dd.setYear(2017);
        dd.setMonth(1);

        GetCursOnDateResponse.GetCursOnDateResult res = port.getCursOnDate(dd);
    }
}
