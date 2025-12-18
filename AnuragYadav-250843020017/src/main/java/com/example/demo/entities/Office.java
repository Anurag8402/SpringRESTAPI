package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="offices")
public class Office {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer officecode;

	@Column
	String city;
	@Column
	String phone;
	@Column
	String addressline1;
	@Column
	String addressline2;
	@Column
	String state;
	@Column
	String country;
	@Column
	String postalcode;
	@Column
	String territory;
	
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getOfficecode() {
		return officecode;
	}
	public void setOfficecode(Integer officecode) {
		this.officecode = officecode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getTerritory() {
		return territory;
	}
	public void setTerritory(String territory) {
		this.territory = territory;
	}




}
