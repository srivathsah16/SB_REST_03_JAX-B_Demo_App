package com.srivath;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.srivath.databinding.Address;
import com.srivath.databinding.Person;

public class JavaToXmlConverter {
	public static void main(String[] args) throws Exception {
		
		Person person = new Person(1, "Ram", "ram@gmail.com", new Address("abc street", "someCity", "someState"));

		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		//converting Java object into XML
		marshaller.marshal(person, new File("Person.xml"));
		System.out.println("Marshelling completed");
	}
}
