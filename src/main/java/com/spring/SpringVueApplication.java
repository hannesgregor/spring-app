package com.spring;

import com.spring.models.Forecast;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;


@SpringBootApplication
public class SpringVueApplication  {


	public static void main(String[] args) {
		SpringApplication.run(SpringVueApplication.class, args);

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Forecast.class);
			URL url = new URL("http://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php");
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			jaxbUnmarshaller.setProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86 Safari/537.36");
			Forecast forecast = (Forecast) jaxbUnmarshaller.unmarshal(url);


			System.out.println(forecast.getNight().get(0).getSea());



		} catch (JAXBException | MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
