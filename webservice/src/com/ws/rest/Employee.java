package com.ws.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"empId","name","surname","age","phone"})
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private long empId;
	
	@QueryParam("isim")
	@NotNull
	@Size(max=20,min=3,message="iþçi ismi 3 ila 20 arasýnda olmalý")
	@XmlElement(name="isim")
	private String name;
	
	@PathParam("soy")
	private String surname;
	
	@HeaderParam("yas")
	@Max(120)
	@Min(12)
	private int age;
	
	@Pattern(regexp="[0-9]+",message="Lütfen sadece numara giriniz")
	private String phone;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
