package com.srivath;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.srivath.databinding.Person;

public class XmlToJavaConverter {
	public static void main(String[] args) throws JAXBException {
		File file = new File("Person.xml");
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object object = unmarshaller.unmarshal(file);
		Person person = (Person) object;
		System.out.println(person);
	}
}
