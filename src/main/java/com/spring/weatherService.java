package com.spring;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class weatherService {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = (Document) builder.parse("https://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php");

            NodeList forecastList = ((Element) doc).getElementsByTagName("forecast");
            for (int i=0; i<forecastList.getLength(); i++){
                Node f = forecastList.item(i);
                if(f.getNodeType() == Node.ELEMENT_NODE) {
                    Element forecast = (Element) f;
                    String date = forecast.getAttribute("date");
                    NodeList partOfDayList = forecast.getChildNodes();
                    for(int j=0; j<partOfDayList.getLength(); j++){
                        Node p = partOfDayList.item(j);
                        if(p.getNodeType()==Node.ELEMENT_NODE){
                            Element partOfDay = (Element) p;
                            System.out.println("Forecast " + date + ":" + partOfDay.getTagName() + "=" +
                                    partOfDay.getTextContent());

                        }
                    }

                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (
    SAXException e) {
            e.printStackTrace();
        } catch (
    IOException e) {
            e.printStackTrace();
        }

    }
}
