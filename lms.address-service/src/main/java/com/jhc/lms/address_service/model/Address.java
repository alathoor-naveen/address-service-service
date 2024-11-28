package com.jhc.lms.address_service.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@SuppressWarnings("deprecation")
@Entity
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_address")
    @GenericGenerator(name = "seq_address", strategy = "increment")
	private Long id;
	@Column(name="house_number")
	private String houseNumb;
	@Column(name="street_name")
	private String street;
	@Column(name="city_name")
	private String city;
	@Column(name="district_name")
	private String district;
	@Column(name="state_name")
	private String state;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHouseNumb() {
		return houseNumb;
	}
	public void setHouseNumb(String houseNumb) {
		this.houseNumb = houseNumb;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(Long id, String houseNumb, String street, String city, String district, String state) {
		super();
		this.id = id;
		this.houseNumb = houseNumb;
		this.street = street;
		this.city = city;
		this.district = district;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [" + (id != null ? "id=" + id + ", " : "")
				+ (houseNumb != null ? "houseNumb=" + houseNumb + ", " : "")
				+ (street != null ? "street=" + street + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (district != null ? "district=" + district + ", " : "") + (state != null ? "state=" + state : "")
				+ "]";
	}
	
	
	

}
