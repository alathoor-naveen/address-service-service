package com.jhc.lms.address_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhc.lms.address_service.model.Address;
import com.jhc.lms.address_service.service.AddressService;

@RestController
@RequestMapping("api/v1/address")
public class AddressServiceContriller {
	
	@Autowired
	private AddressService service;
	
	
	@PostMapping("/add")
	public ResponseEntity<Address> addAddress(@RequestBody Address address){
	Address address1 = service.addAddress(address);
	return ResponseEntity.ok(address1);
	}
	
	@GetMapping()
	public ResponseEntity<List<Address>>getAllAddress(){
		List<Address> services=service.getAllAddress();
		return ResponseEntity.ok(services);
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<Optional<Address>> getById(@PathVariable("id")Long id){
		Optional<Address> address=service.getById(id);
		return ResponseEntity.ok(address);
	}
	@GetMapping("/find/house/{houseNumb}")
	public ResponseEntity<Optional<Address>> getByHouseNumb(@PathVariable("houseNumb")String houseNumb){
		Optional<Address> address=service.getByHouseNumb(houseNumb);
		return ResponseEntity.ok(address);
	}
	@GetMapping("/find/street/{streetName}")
	public ResponseEntity<Optional<Address>> getByStreet(@PathVariable("streetName")String street){
		Optional<Address> address=service.getByStreet(street);
		return ResponseEntity.ok(address);
	}
	@GetMapping("/find/city/{cityName}")
	public ResponseEntity<Optional<Address>> getByCity(@PathVariable("cityName")String city){
		Optional<Address> address=service.getByCity(city);
		return ResponseEntity.ok(address);
	}
	@GetMapping("/find/district/{districtName}")
	public ResponseEntity<Optional<Address>> getByDistrict(@PathVariable("districtName")String district){
		Optional<Address>address=service.getByDistrict(district);
		return ResponseEntity.ok(address);
	}
	@GetMapping("/find/state/{stateName}")
	public ResponseEntity<Optional<Address>> getByState(@PathVariable("stateName")String state){
		Optional<Address> address=service.getByState(state);
		return ResponseEntity.ok(address);
	}
	@PutMapping("/update/id/{id}")
	public ResponseEntity<Address> updateById(@RequestBody Address address,@PathVariable("id") long id ){
		Address address1=service.updateById(id);
		return ResponseEntity.ok(address1);
	}
	@DeleteMapping("/Delete/id/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id")Long id){
		return null;
		
	}
	

}
