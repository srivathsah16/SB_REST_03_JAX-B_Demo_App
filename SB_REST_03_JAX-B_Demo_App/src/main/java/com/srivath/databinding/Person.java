package com.srivath.databinding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Person {
	
	private Integer id;
	private String name;
	private String email;
	private Address address;
}
